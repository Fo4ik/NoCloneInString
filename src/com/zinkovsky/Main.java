package com.zinkovsky;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main {
    public static void main(String[] args) {
        String str1 = "this apple is sweet";
        String str2 = "this apple is sour";

        List<String> set1 = new ArrayList<>(Arrays.asList(str1.split(" ")));

        for (String s : Arrays.asList(str2.split(" "))) {
            if (set1.contains(s)) set1.remove(s);
            else set1.add(s);
        }

        System.out.println(String.join(" ", set1));
    }
}