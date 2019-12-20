package edu.dmacc.dsmcode.coma510.review.assignment;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Problem2 {
    /**
     * Create a function for each of the methods commented below. Then call each of them in the main.
     */
    public static void main(String[] args) {
        // public Integer stringToInt(String s) { return s.length(); }
//        Function<String, Integer> stringToInt = s -> s.length();
        Function<String, Integer> stringToInt = String::length;
        System.out.println(stringToInt.apply("Greg"));

        // public Integer stringsToInt(String r, String s) { return r.length() + s.length(); }
//        BiFunction<String, String, Integer> stringsToInt =
//                (r, s) -> r.length() + s.length();
        BiFunction<String, String, Integer> stringsToInt =
                (r, s) -> stringToInt.apply(r) + stringToInt.apply(s);
        System.out.println(stringsToInt.apply("Greg", "Hazen"));

        // public void useString(String s) { System.out.println(s); }
//        Consumer<String> useString = s -> System.out.println(s);
        Consumer<String> useString = System.out::println;
        useString.accept("Greg");

        // public String makeString { return “Hello!”; }
        Supplier<String> makeString = () -> "Hello!";
        System.out.println(makeString.get());
    }
}
