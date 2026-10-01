# ProjectOct26

Selenium + Java + Maven + JUnit 5 automation framework for the OrangeHRM demo application.

## Technology Stack

- Java 17
- Selenium WebDriver 4.48.0
- JUnit 5.13.1
- Maven
- Page Object Model
- Selenium Manager
- Explicit waits
- JUnit TestWatcher for failure screenshots
- Jenkins Pipeline
- GitHub Actions

## Framework Structure

```text
ProjectOct26
├── pom.xml
├── Jenkinsfile
├── .github/workflows/selenium-tests.yml
├── src/main/java
│   ├── config/ConfigReader.java
│   ├── driver/DriverFactory.java
│   ├── pages/BasePage.java
│   ├── pages/LoginPage.java
│   ├── pages/DashboardPage.java
│   └── utils/WaitUtils.java
└── src/test/java
    ├── base/BaseTest.java
    ├── extensions/ScreenshotExtension.java
    └── tests/LoginTest.java
```

## Browser Driver

The framework uses Selenium Manager through Selenium 4, so a separate WebDriverManager dependency is not required.

## Configuration

`src/test/resources/config.properties` contains:

```properties
baseUrl=https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
username=Admin
password=admin123
browser=chrome
headless=true
explicitWaitSeconds=15
```

System properties and environment variables take precedence over the properties file.

Examples:

```text
-DbaseUrl=...
-Dusername=...
-Dpassword=...
-Dbrowser=chrome
-Dheadless=false
```

## Test Tags

Tests can be tagged as:

- smoke
- regression

## CI

### Jenkins

The included `Jenkinsfile`:

- Checks out the repository
- Runs the Selenium suite
- Publishes JUnit/Surefire results
- Archives failure screenshots
- Schedules execution at 10:30 AM IST on weekdays.

For Jenkins to use the Jenkinsfile, create a Pipeline job connected to this GitHub repository and select "Pipeline script from SCM".

### GitHub Actions

The workflow:

- Runs on push to main
- Runs on pull requests to main
- Can be started manually
- Runs automatically at 10:30 AM IST on weekdays
- Uploads Surefire reports
- Uploads failure screenshots

## Important CI Note

The demo credentials are public demo credentials. For a real project, do not commit credentials to Git. Store them as Jenkins credentials or GitHub Actions secrets and pass them as environment variables/system properties.

## Local Browser Mode

For debugging locally, change:

```properties
headless=false
```

The test will open Chrome visibly.

## Reports

After execution:

```text
target/surefire-reports/
```

Failure screenshots:

```text
target/screenshots/
```
