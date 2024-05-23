package org.example;

import java.util.Optional;

import static java.util.Optional.ofNullable;

public class OptionalPractice {
    public static void main(String[] args) {
        String[] str = new String[5];
        str[3] = "I Love Coding";

        Optional<String> optional = Optional.ofNullable(str[3]);

        System.out.println(optional);
        System.out.println(optional.get());
        System.out.println(optional.isPresent());
        System.out.println(optional.isEmpty());

        if(optional.isPresent()){
            System.out.println(optional.get());
        }
        else{
            System.out.println("not present");
        }

        String val = optional.orElse("not present");
        System.out.println(val);

    }
}
