package com.projectoct26.ProgramsPractice;

public class ArmStrong {

    public static boolean isArmString(int num) {
        int temp = num;
        int sum = 0;

        int digits = String.valueOf(num).length();
        while (num > 0) {
            int rem = num % 10;
            sum = sum + multiplication(rem, digits);
            num = num / 10;
        }
        return sum == temp;
    }

    public static int multiplication(int num, int digits) {
        int multiplication = 1;
        for (int i = 0; i < digits; i++) {
            multiplication = multiplication * num;
        }
        return multiplication;
    }

    public static void main(String[] args) {
        int num = 154;
        if (isArmString(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}
