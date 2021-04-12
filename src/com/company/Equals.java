package com.company;

/* Napisz program, który wywoła funkcję equals na instancji klasy Object
używając mechanizmu odwoływania się do metody (przy pomocy ::).
 */

import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class Equals {

    public static void main (String[] args) {
        Supplier<Object> objectCreator = Object::new;
        Object objectInstance = objectCreator.get();
        System.out.println(objectInstance);
//  DO zastanowienia:
//          Dlaczego w tych przypadkach mamy false?
//          W jaki sposób equals porównuje obiekty?
//          Jaka jest różnica między equals i ==
//          Na czym polega kontrakt equals-hashCode?
//
//        Oraz:
//              stwórz logikę, ktora porówna dwa takie same obiekty i zwróci true

        BiPredicate<Object, Object> equalsMethodOnClass = Object::equals;
        System.out.println(equalsMethodOnClass.test(objectInstance, new Object()));


        Predicate<Object> equalsMethodOnObject = objectInstance::equals;
        System.out.println(equalsMethodOnObject.test(new Object()));
    }
}
