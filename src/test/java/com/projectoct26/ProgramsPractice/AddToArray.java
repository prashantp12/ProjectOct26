package com.projectoct26.ProgramsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddToArray {
    public static void main(String[] args) {
        String[] a ={"aa","bb","cc"};

        List<String> list= new ArrayList<>(Arrays.asList(a));
        list.add("dd");
        list.add("ff");

        System.out.println(list);
    }
}
