package com.practice.problemsolving;

/**
 * Input: Given a array with numbers from {1-n} (Here n is the size of array) in random order.
 * Constraint: In each step you are allowed to swap any two numbers.
 * Find minimum steps required to sort the array in ascending order.
 * Ex: array : [7, 1, 3, 2, 4, 5, 6]
 *             i   arr                         swap (indices)
 *             0   [7, 1, 3, 2, 4, 5, 6]   swap (0,3)
 *             1   [2, 1, 3, 7, 4, 5, 6]   swap (0,1)
 *             2   [1, 2, 3, 7, 4, 5, 6]   swap (3,4)
 *             3   [1, 2, 3, 4, 7, 5, 6]   swap (4,5)
 *             4   [1, 2, 3, 4, 5, 7, 6]   swap (5,6)
 *             5   [1, 2, 3, 4, 5, 6, 7]
 *     Result : 5 steps
 * */
public class SortArrayWithMinimumSwap {
}
