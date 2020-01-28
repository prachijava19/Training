package com.training.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;




/**
 * Collect accepts a Collector which consists of four different operations:
 * a supplier, an accumulator, a combiner and a finisher. Several collectors are implemented
 * in the Collectors class.
 */
public class Collector {



    static List<Person> persons = Arrays.asList(
            new Person("Alfa", 20),
            new Person("Bravo", 30),
            new Person("Charlie", 40),
            new Person("Delta", 50),
            new Person("Echo", 60),
            new Person("Foxtrot", 60));

    public static void main(String[] args) {
        toList();
        count();
        average();
        join();
        grouping();
    }

    /**
     * Returns the Stream output as a List.
     */
    private static void toList() {
        List<Person> filtered = persons.stream()
                .filter(p -> p.name.contains("a")) // Predicate
                .collect(Collectors.toList());

        System.out.println("{} of {} persons have  \"a\" int their name"+  filtered.size()+ " "+ persons.size());
    }

    /**
     * Counting Stream elements;
     */
    private static void count() {
        long count = persons.stream()
                            .collect(Collectors.counting());

        System.out.println("Count is {}" +  count);
    }

    /**
     * Calculating an average of the Stream output.
     */
    private static void average() {
        Double average = persons.stream()
                                .collect(Collectors.averagingInt(p -> p.age));

        System.out.println("Average age is {}" + average);
    }

    /**
     * Joining the Stream output.
     */
    private static void join() {
        String phrase = persons
                .stream()
                .filter(p -> p.age >= 30)
                .map(p -> p.name)
                .collect(Collectors.joining(", ")); // (String delimiter, String prefix, String postfix)

        System.out.println("Joined person string is \"{}\""+  phrase);
    }

    private static void grouping() {
        Map<Integer, List<Person>> group = persons
                .stream()
                .collect(Collectors.groupingBy(p -> p.age));
        group.forEach((age, persons) -> System.out.println("Persons with age {}: {}"+  age+ " " + persons.size()));
    }
}
