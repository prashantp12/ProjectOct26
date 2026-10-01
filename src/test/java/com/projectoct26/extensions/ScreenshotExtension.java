package com.projectoct26.extensions;

import com.projectoct26.driver.DriverFactory;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class ScreenshotExtension implements TestWatcher {

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        try {
            Path screenshotDir = Path.of("target", "screenshots");
            Files.createDirectories(screenshotDir);

            String testName = context.getRequiredTestClass().getSimpleName()
                    + "_" + context.getRequiredTestMethod().getName();

            Path destination = screenshotDir.resolve(testName + ".png");

            byte[] screenshot = ((TakesScreenshot) DriverFactory.getDriver())
                    .getScreenshotAs(OutputType.BYTES);

            Files.write(destination, screenshot);
        } catch (IOException | RuntimeException ignored) {
            // Screenshot failure should not hide the original test failure.
        }
    }
}
