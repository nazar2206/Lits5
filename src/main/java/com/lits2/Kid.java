package com.lits2;


import java.util.Objects;

public class Kid  implements Comparable<Kid> {
    private String name;
    private int age;

    public Kid(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "Kid{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Kid)) return false;
        Kid kid = (Kid) o;
        return age == kid.age &&
                Objects.equals(name, kid.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Kid kid) {
        return Integer.compare(this.getAge(),kid.getAge());
    }
}
