package com.projectoct26.ProgramsPractice;

public class ReverseString1 {

    public static void main(String[] args) {
        String str = "i am doing java coding";

        char[] arr1 = str.toCharArray();
        char[] arr2 = new char[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == ' ') {
                arr2[i] = ' ';
            }
        }

        int j = arr1.length - 1;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != ' ') {
                while (arr2[j] == ' ') {
                    j--;
                }

                arr2[j] = arr1[i];
                j--;
            }
        }
        System.out.println(arr2);
    }
}
