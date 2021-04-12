package com.company;

/* Napisz program, który pobierze od użytkownika cztery łańcuchy znaków,
które umieścisz w liście. Następnie posortuj tę listę używając metody List.sort.
Użyj wyrażenia lambda, które posortuje łańcuchy znaków malejąco po długości.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("wypisz cztery łańcuchy znaków");
//nazwy zmiennych piszemy raczej po angielsku
        List<String> lancuchy = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            lancuchy.add(scanner.nextLine());
        }

        System.out.println(lancuchy);
//        tutaj jest zły warunek
//         uruchom ten program kilka razy dla różnych łańcuchów, przeanalizuj co jest źle i postaraj się go naprawić
//        podpowiedż: https://dzone.com/articles/java-8-comparator-how-to-sort-a-list
        lancuchy.sort((a, b) -> b.length() - a.length());
        System.out.println(lancuchy);
    }
}
