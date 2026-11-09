package com.projectoct26.ProgramsPractice;

public class ReplaceAllCharacterExceptLast {

    public static void main(String[] args) {
        String str = "java data programming";

        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) =='a' && i!=str.lastIndexOf('a')){
                sb.setCharAt(i,'p');
            }
        }
        System.out.println(sb.toString());
    }
}
