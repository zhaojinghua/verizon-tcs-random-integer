package com.verizon.randominteger;

import java.util.HashSet;
import java.util.Set;

/**
 * Random integer implementatin
 *
 * @author Jing Hua Zhao
 * @since 07/21/2020.
 */
public class RandomInteger {

    /**
     * print the list of integers from 1 to n in random order
     *
     * @param n the maximum possible integer
     */
    public void generateRandomNumbers (int n) {

        //Use set to achieve uniqueness
        Set<Integer> numbers = new HashSet<>();

        //Check size to make sure we have no gap in the range of 1 to n
        while (numbers.size() != n) {
            int number = (int) (Math.random() * n + 1);
            numbers.add(number);
        }
        numbers.stream().forEach(System.out::println);
    }
}
