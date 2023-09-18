package com.aleshamray.seven_kyu;

import java.util.Arrays;

public class Parity {
  public static void main(String[] args) {
    System.out.printf("\nexpected: even\nreceived: %s\n", Parity.oddOrEven(new int[] {}));
    System.out.printf("\nexpected: odd\nreceived: %s\n", Parity.oddOrEven(new int[] {1, 2, 3, 4, 5, 6}));
    System.out.printf("\nexpected: odd\nreceived: %s\n", Parity.oddOrEven(new int[] {2, 5, 34, 6}));
    System.out.printf("\nexpected: even\nreceived: %s\n", Parity.oddOrEven(new int[] {-3, -6, -9, -12}));
  }

  // public static String oddOrEven (int[] array) {
  //   int result = 0;
  //   for(int num : array) {
  //     result += num;
  //   }
  //   return result % 2 == 0 ? "even" : "ood";
  // }


  public static String oddOrEven (int[] array) {
    return Arrays.stream(array).sum() % 2 == 0 ? "even" : "odd";
  }
}


/*

Task:
Given a list of integers, determine whether the sum of its elements is odd or even.

Give your answer as a string matching "odd" or "even".

If the input array is empty consider it as: [0] (array with a zero).


Examples:
Input: [0]
Output: "even"

Input: [0, 1, 4]
Output: "odd"

Input: [0, -1, -5]
Output: "even"

*/