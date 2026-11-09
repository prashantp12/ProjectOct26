package com.projectoct26.ProgramsPractice;

public class LargestSmallest {
    public static void main(String[] args) {
        int[] nums = {50, 5, 8, 7, 27, 25, 11};

        int largest = nums[0];
        int smallest = nums[0];

        for (int n : nums) {
            if (n > largest) {
                largest = n;
            } else if (n < smallest) {
                smallest = n;
            }
        }
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
    }
}
