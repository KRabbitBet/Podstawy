package com.company;

// Utwórz instancję klasy Human przy pomocy mechanizmu odwoływania się do konstruktora (przy pomocy ::).

import java.util.function.BiFunction;

//nazwa tej klasy może być myląca bo nie jest to klasa Human a metoda uruchomieniowa używająca klasy Human np. jakiś HumanService byłby bardziej właściwy
public class Human2 {

    public static void main(String[] args) {

        BiFunction<Integer, String, Human> humanConstructor = Human::new;
        Human human = humanConstructor.apply(39, "Piotr");
        System.out.println(human.getAge());
        System.out.println(human.getName());
    }

}
