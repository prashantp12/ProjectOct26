package com.projectoct26.ProgramsPractice;

public class VerifyStrongPassword {

    static boolean isStrongPassword(String password){
        return password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[#$*@]).{8,}$");
    }

    public static void main(String[] args) {
        System.out.println(isStrongPassword("Password"));
    }
}
