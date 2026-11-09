package com.projectoct26.ProgramsPractice;


import java.util.*;

public class Anagram {

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (str1.length() != str2.length()) {
            System.out.println("Strings are not anagrams1");
            return;
        }

        char[] arr1 = str1.toLowerCase().toCharArray();
        char[] arr2 = str2.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("String are anagrams");
        } else {
            System.out.println("Strings are not anagrams");
        }
    }
}
