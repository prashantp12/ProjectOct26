package com.projectoct26.ProgramsPractice;

public class OccuranceOfCharacter {

    public static void main(String[] args) {
        String p = "my name is prashant patil, I love java programming very much";
//int count=0;
        for(int i=0;i<p.length();i++){
            char c = p.charAt(i);

            if(p.indexOf(c)==i && c!=' '){
                int count = p.length()-p.replace(String.valueOf(c),"").length();
                System.out.println("Length of "+c+" is "+count);
            }
        }
    }
}
