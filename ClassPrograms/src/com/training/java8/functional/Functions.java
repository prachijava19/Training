package com.training.java8.functional;

import java.util.function.Function;

/**
 * Functions accept one argument and produce a result.
 * Default methods can be used to chain multiple functions together (compose, andThen).
 */
public class Functions {


    public static void main(String[] args) {
        Function<String, Integer> toInt = Integer::valueOf;
        Function<String, String> backToString1 = toInt.andThen(String::valueOf);
       System.out.println("Integer converted back to string is {}"+ backToString1.apply("123"));

        // Compose executes passed-in function first
        Function<Integer, String> toString = String::valueOf;
        Function<String, String> backToString2 = toString.compose(Integer::valueOf);
       System.out.println("Integer converted back to string is {}"+ backToString2.apply("123"));
    }
}