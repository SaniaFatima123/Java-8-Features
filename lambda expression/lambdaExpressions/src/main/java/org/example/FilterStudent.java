package org.example;


// a predicate functional interface of Java is a type of function that accepts a single
// value or argument and does some sort of processing on it, and returns a boolean
@FunctionalInterface
public interface FilterStudent {
    boolean test(Student student);
}
