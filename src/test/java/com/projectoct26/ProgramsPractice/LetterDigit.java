package com.projectoct26.ProgramsPractice;

import java.util.ArrayList;
import java.util.List;

public class LetterDigit {

    public static void main(String[] args) {
        String str = "auto123mation";

        List<Character> chars = new ArrayList<>();
        List<Integer> nums = new ArrayList<>();

        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);

            if(Character.isLetter(ch)){
                chars.add(ch);
            } else if (Character.isDigit(ch)) {
                nums.add(Character.getNumericValue(ch));
            }
        }
        System.out.println(chars);
        System.out.println(nums);
    }
}
