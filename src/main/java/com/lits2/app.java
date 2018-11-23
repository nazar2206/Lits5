package com.lits2;

import java.util.*;

class app2 {
    public static void main(String[] args) {
        Set<Kid> kids = new TreeSet<>();
        kids.add(new Kid("Nick", 1));
        kids.add(new Kid("Jack", 4));
        kids.add(new Kid("Mikki",8));
        kids.add(new Kid("Ann",3));
        kids.add(new Kid("Jhon",7));
        kids.add(new Kid("Lane",9));
        System.out.println(kids);


    }

}
