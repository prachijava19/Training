package com.training.java8.functional;



import java.util.function.Supplier;

/**
 * Suppliers produce a result of a given generic type. Unlike Functions, Suppliers don't accept arguments.
 */
public class Suppliers {


    public static void main(String[] args) {
        Supplier<Person> personSupplier = Person::new;
        Person person = personSupplier.get();
        person.setId(100);
       System.out.println("Person has id {}"+ person.getId());
    }

    private static class Person {

        private int id;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }
}