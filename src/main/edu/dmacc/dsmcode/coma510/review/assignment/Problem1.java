package edu.dmacc.dsmcode.coma510.review.assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem1 {
    /**
     * Convert the sort, if condition, and loop into a stream pipeline. The main should still output the following after
     * converting to a pipeline:
     * 100
     * 101
     * 120
     * 405
     */
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(100, 120, 30, 405, 51, 99, 101));

        numbers.sort(Integer::compareTo);
        for(Integer number : numbers) {
            if(number >= 100) {
                System.out.println(number);
            }
        }
    }
}
