package com.eldad.jnius.example;

import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        Calculator calculator = new Calculator(1, 2);
        System.out.printf("Mean of list is: %.2f\n", calculator.calculateFactoredMean(numbers));
        System.out.printf("Mean of list is: %.2f\n", calculator.calculateFactoredMean(numbers));
        System.out.printf("Mean of list is: %.2f\n", calculator.calculateFactoredMean(numbers));
    }
}

