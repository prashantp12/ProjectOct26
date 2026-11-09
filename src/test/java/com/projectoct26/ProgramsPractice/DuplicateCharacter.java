package com.projectoct26.ProgramsPractice;

public class DuplicateCharacter {

    public static void main(String[] args) {
        String str = "programming";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (str.indexOf(c) != str.lastIndexOf(c) && i==str.indexOf(c)) {
                System.out.println(c);
            }
        }
    }
}
