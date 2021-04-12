package com.company;

/* Napisz program, który pobierze o użytkownika cztery łańcuchy znaków,
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

        List<String> lancuchy = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            lancuchy.add(scanner.nextLine());
        }

        System.out.println(lancuchy);
        lancuchy.sort((a, b) -> b.length() - a.length());
        System.out.println(lancuchy);
    }
}
