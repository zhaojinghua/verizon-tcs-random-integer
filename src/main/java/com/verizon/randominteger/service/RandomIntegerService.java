package com.verizon.randominteger.service;

@FunctionalInterface
public interface RandomIntegerService {

    /**
     * Print the list of integers from 1 to n in random order
     *
     * @param n the maximum possible integer
     */
    void generateRandomNumbers (Integer n);
}
