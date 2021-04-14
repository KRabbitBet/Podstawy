package com.company;

/* Napisz program, który pobierze od użytkownika cztery łańcuchy znaków,
które umieścisz w liście. Następnie posortuj tę listę używając metody List.sort.
Użyj wyrażenia lambda, które posortuje łańcuchy znaków malejąco po długości.
 */

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write four words of different lengths");

        List<String> words = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            words.add(scanner.nextLine());
        }

        System.out.println(words);

        words.sort(Comparator.comparingInt(String::length).reversed());
        System.out.println(words);
    }


}