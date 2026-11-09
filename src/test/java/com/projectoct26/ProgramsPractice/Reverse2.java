package com.projectoct26.ProgramsPractice;

public class Reverse2 {

    public static void main(String[] args) {
        String str = "java coding";
        StringBuilder sb;

        String[] arr = str.split(" ");
        String rev = "";
        for (String word : arr) {
            sb = new StringBuilder(word);
            rev = rev + sb.reverse().append(" ");
        }
        System.out.println(rev.trim());
    }
}
