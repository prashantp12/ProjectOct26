package com.projectoct26.ProgramsPractice;

import java.util.ArrayList;
import java.util.List;

public class FindVowel {

    public static void main(String[] args) {
        String input = "Hello World";
        input = input.replaceAll("\\s", "");
        List<Character> vowel = new ArrayList<>();
        List<Character> constant = new ArrayList<>();

        for (int i = 0; i < input.toLowerCase().length(); i++) {
            char ch = input.charAt(i);

            if ("aeiou".indexOf(ch) >= 0) {
                vowel.add(ch);
            } else {
                constant.add(ch);
            }
        }
        System.out.println("Vowel: " + vowel.size());
        System.out.println("Constant: " + constant.size());
    }
}
