package com.training.java8.functional;


import java.util.Comparator;


/**
 * Comparators are well known from older versions of Java. Java 8 adds various default methods to the interface
 */
public class Comparators {


    public static void main(String[] args) {
        Person person1 = new Person("First", "Last");
        Person person2 = new Person("Second", "Third");

        Comparator<Person> firstNameComparator = (p1, p2) -> p1.firstName.compareTo(p2.firstName);
       System.out.println("Comparing firstname returns {}"+ firstNameComparator.compare(person1, person2));
       System.out.println("Comparing lastname reversed returns {}"+ firstNameComparator.reversed().compare(person1, person2));

        // Chaining comparators
       System.out.println("Comparing firstname and lastname returns {}"+ firstNameComparator
                .thenComparing((p1, p2) -> p1.lastName.compareTo(p2.lastName))
                .compare(person1, person2));
    }
}
