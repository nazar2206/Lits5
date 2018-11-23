package com.lits;

import java.util.HashSet;
import java.util.Set;

public class app {
    public static void main(String[] args) {
        Set<String> name = new HashSet<String>();
        Set<String> name1 = new HashSet<String>();
        name.add("Jony");
        name.add("Ann");
        name.add("Bony");
        name.add("Mike");
        name.add("Bob");
        name.add("Bob");
        name.add("Jack");
        name.add("Calvin");
        name.add("Rock");
        name.add("Vinni");
        name.add("Mikki");
        name.add("Potter");
        name.add("Denis");
        name.add("Calvin");
        name.add("Tomy");
        System.out.println("Size: " + name.size());
        for(String i : name){
           String firstLetter = Character.toString(i.charAt(0));
           if(firstLetter.equals("A") || firstLetter.equals("B") || firstLetter.equals("C") || firstLetter.equals("V") || firstLetter.equals("P")){
               name1.add(i);
           }
        }
        name.removeAll(name1);
        System.out.println(name);
    }
}
