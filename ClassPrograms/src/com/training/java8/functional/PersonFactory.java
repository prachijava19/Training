package com.training.java8.functional;

@FunctionalInterface
interface PersonFactory<P extends Person> {
    P create(String firstName, String lastname);
}
