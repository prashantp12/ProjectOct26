package com.projectoct26.ProgramsPractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindIndices {

    public static void main(String[] args) {
        int[] arr = {15, 10, 11, 16};
        int total = 27;

        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int diff = total - arr[i];

            if (map.containsKey(diff)) {
                System.out.println(map.get(diff)+", "+i);
            }else{
                map.put(arr[i],i);
            }
        }
        System.out.println(map);
    }
}
