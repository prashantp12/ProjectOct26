package com.projectoct26.ProgramsPractice;

public class FindSubStringWithoutContains {

    public static void main(String[] args) {
        String str1 = "Leetcode";
        String str2 = "codi";

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == str2.charAt(0)) {
                if (str1.substring(i, str2.length() + i).equals(str2)) {
                    System.out.println("String str2 is contains in str1");
                } else {
                    System.out.println("String str2 is not contains in str1");
                }
            }
        }
    }
}
