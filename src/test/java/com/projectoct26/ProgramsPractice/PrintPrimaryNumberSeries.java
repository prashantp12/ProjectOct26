package com.projectoct26.ProgramsPractice;

import java.util.Scanner;

public class PrintPrimaryNumberSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number n");
        int num = sc.nextInt();

        for(int i=1;i<=num;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }

    }

    public static boolean isPrime(int num) {
        if (num == 0 || num == 1) {
            return false;
        }
        for(int i=2; i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
