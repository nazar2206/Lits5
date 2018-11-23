package com.lits2;

import java.util.Set;
import java.util.TreeSet;

public class app3 {
    public static void main(String[] args) {
        Set<Kid> kids = new TreeSet<>();
        kids.add(new Kid("Nick", 1));
        kids.add(new Kid("Jack", 4));
        kids.add(new Kid("Mikki",8));
        kids.add(new Kid("Ann",13));
        kids.add(new Kid("Jhon",17));
        kids.add(new Kid("Lane",9));
//        System.out.println(kids);
        for (Kid kid : kids) {
            if (kid.getAge() > 10) {
                System.out.println(kid);
            }
        }

    }
}
