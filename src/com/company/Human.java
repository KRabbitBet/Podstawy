package com.company;

// Utwórz instancję klasy Human przy pomocy mechanizmu odwoływania się do konstruktora (przy pomocy ::).


public class Human {

    private int age;
    private String name;

    Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    int getAge() {
        return age;
    }

    String getName() {
        return name;
    }

}