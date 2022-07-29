package com.bootcampexcercise.module10;

public abstract class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
        this.name = "Default Name";
        this.age = 42;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void introduce();
}
