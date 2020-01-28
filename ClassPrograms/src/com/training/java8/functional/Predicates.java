package com.training.java8.functional;



import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

/**
 * Predicates are boolean-valued functions of one argument.
 * This built-in functional interface contains various default methods for composing
 * predicates to complex logical terms (and, or, negate).
 */
public class Predicates {


    public static void main(String[] args) {
        Predicate<String> emptyString = (string) -> string.length() > 0;
       System.out.println("Testing a String yields {}"+ emptyString.test("value"));
       System.out.println("Testing an empty String yields {}"+ emptyString.test(""));

        // Negating
        Predicate<String> negatedTest = emptyString.negate();
       System.out.println("Testing a negated String yields {}"+ negatedTest.test("value"));

        // Combining predicates
        Predicate<Integer> above = value -> value >= 2;
        Predicate<Integer> belov = value -> value <= 4;
        Predicate<Integer> between2and4 = above.and(belov);

       System.out.println("Testing between2and4 using 1 yields {}"+ between2and4.test(1));
       System.out.println("Testing between2and4 using 2 yields {}"+ between2and4.test(2));
       System.out.println("Testing between2and4 using 3 yields {}"+ between2and4.test(3));
       System.out.println("Testing between2and4 using 4 yields {}"+ between2and4.test(4));
       System.out.println("Testing between2and4 using 5 yields {}"+ between2and4.test(5));

        // Using method references
        Predicate<List<String>> emptyList = List::isEmpty;
       System.out.println("Testing an empty List returns {}"+ emptyList.test(new ArrayList<>()));

        Predicate<Boolean> isNull = Objects::isNull;
       System.out.println("Testing isNull using null yields {}"+ isNull.test(null));
    }
}
