package com.practice.problemsolving;
/*
* Given 2 integers (num1, num2), write a function that returns the count of numbers between the num1..num2 that are divisible by num1.
* E.g.: count(3, 15) returns 5 (3, 6, 9, 12, 15).
* Note : You need to consider Inclusive range & num1, num2 >= 0.
* INPUTS:  Two numbers num1, num2.
* OUTPUT: Return the count of numbers between the num1..num2 that are divisible by num1.
* */

public class CountNumbers {
    public static void main(String[] args) {
    	System.out.println(countDivisable(3, 15));
    }
    public static Integer countDivisable(Integer x, Integer y) {
		int count = 0;
		for (int n = x; n < y; n++) {
			if (n % x == 0)
				count++;
		}

		return count;

	}
}
