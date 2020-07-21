package com.verizon.randominteger.service.impl;

import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Random integer implementatin
 *
 * @author Jing Hua Zhao
 * @since 07/21/2020.
 */
@Service
public class RandomIntegerServiceImpl {

    /**
     * Print the list of integers from 1 to n in random order
     *
     * @param n the maximum possible integer
     */
    public void generateRandomNumbers (Integer n) throws IllegalArgumentException {
        if (n < 1) {
            throw new IllegalArgumentException("Input should be greater than or equal to one.");
        }

        //Use LinkedHashSet to achieve uniqueness and preserve added order
        Set<Integer> numbers = new LinkedHashSet<>();

        //Check size to make sure we have no gap in the range of 1 to n
        while (numbers.size() != n) {
            int number = (int) (Math.random() * n + 1);
            numbers.add(number);
        }
        numbers.stream().forEach(System.out::println);
    }
}
