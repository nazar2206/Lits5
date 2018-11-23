package com.com;

import java.util.HashSet;
import java.util.Set;

public class lits4 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        set1.add("name1");
        set1.add("name2");
        set1.add("name3");
        set1.add("name4");
        set1.add("name5");
        set1.add("name6");
        set1.add("name7");
        set1.add("name8");
        set1.add("name9");
        set1.add("name10");
        set2.add("name2");
        set2.add("name11");
        set2.add("name12");
        set2.add("name4");
        set2.add("name5");
        set2.add("name22");
        set2.add("name33");
        set1.retainAll(set2);
        System.out.println(set1);
    }
}
