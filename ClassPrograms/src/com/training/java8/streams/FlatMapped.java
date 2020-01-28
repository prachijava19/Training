package com.training.java8.streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;




public class FlatMapped {


    public static void main(String[] args) {
        flatMap();
        optionals(new Outer());
    }

    /**
     * FlatMap transforms one object into multiple others, so each object will be transformed into zero,
     * one or multiple other objects backed by streams
     */
    private static void flatMap() {
        List<Foo> fooList = new ArrayList<>();
        
        //list of list of integer

       //  int arr[][] = {1,2,3,4,5};
        
   // create a map with values as map containing list of persons
        
        //Map<Integer,Map<String,List<Person>> hm = new HashMap<>();
       // List<List<Integer>> lName = new ArrayList<>();
        
       
        
        IntStream.range(1, 4)
                 .forEach(i -> fooList.add(new Foo("Foo" + i)));

        fooList.forEach(foo -> IntStream.range(1, 4)
                                        .forEach(i -> foo.bars.add(new Bar(foo.name + "Bar" + i))));

        // FlatMap accepts a function which has to return a stream of objects
        fooList.stream()
               .flatMap(foo -> foo.bars.stream())
               .forEach(bar -> System.out.println("{}"+ bar.name));

        // Single pipeline
        IntStream.range(1, 4)
                 .mapToObj(i -> new Foo("Foo" + i))
                 .peek(foo -> IntStream.range(1, 4)
                                       .mapToObj(i -> new Bar(foo.name + "Bar" + i))
                                       .forEach(foo.bars::add))
                 .flatMap(foo -> foo.bars.stream())
                 .forEach(bar -> System.out.println("{}"+ bar.name));
    }

    /**
     * FlatMap is also available for the Optional class and can be utilized to prevent nasty null checks.
     */
    private static void optionals(Outer outer) {
        if (outer != null && outer.nested != null && outer.nested.inner != null && outer.nested.inner.foo != null) {
            System.out.println("Foo is {}"+ outer.nested.inner.foo);
        }

        // Optional FlatMap
        Optional<String> result = Optional.ofNullable(outer)
                .flatMap(o -> Optional.ofNullable(o.nested))
                .flatMap(n -> Optional.ofNullable(n.inner))
                .flatMap(i -> Optional.ofNullable(i.foo));

        if (result.isPresent()) {
            System.out.println("Foo is {}"+ result.get());
        }
    }

    private static class Outer {

        Nested nested;
    }

    private static class Nested {

        Inner inner;
    }

    private static class Inner {

        String foo;
    }

}
