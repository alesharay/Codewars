package com.aleshamray.eight_kyu;

/*
  Complete the square sum function so that it squares each number passed into it and then sums the results together.

  For example, for [1, 2, 2] it should return 9 because 1^2 + 2^2 + 2^2 = 9.
*/

public class SquareSum
{
  public static int squareSum(int[] n)
  {
    int sum = 0;
    for (int value : n)
      sum += (value * value);
    return sum;
  }

  public static void main(String[] args) {
    System.out.println("9 " + SquareSum.squareSum(new int[] {1,2,2}));
    System.out.println("5 " + SquareSum.squareSum(new int[] {1,2}));
    System.out.println("50 " + SquareSum.squareSum(new int[] {5,-3,4}));
  }
}