package com.aleshamray.seven_kyu;

/*
    Given two integers a and b, which can be positive or negative, find the sum of all the numbers between including them too and return it. If the two numbers are equal return a or b.

    Note: a and b are not ordered!

    Examples
    GetSum(1, 0) == 1   // 1 + 0 = 1
    GetSum(1, 2) == 3   // 1 + 2 = 3
    GetSum(0, 1) == 1   // 0 + 1 = 1
    GetSum(1, 1) == 1   // 1 Since both are same
    GetSum(-1, 0) == -1 // -1 + 0 = -1
    GetSum(-1, 2) == 2  // -1 + 0 + 1 + 2 = 2
*/

public class Sum
{
  public static void main(String... args) 
  {
    Sum sum = new Sum();
    System.out.println();
    System.out.println("Expected: 1 --- Received: " + sum.GetSum(1, 0));   // 1 + 0 = 1
    System.out.println("Expected: 3 --- Received: " + sum.GetSum(1, 2));   // 1 + 2 = 3
    System.out.println("Expected: 1 --- Received: " + sum.GetSum(0, 1));   // 0 + 1 = 1
    System.out.println("Expected: 1 --- Received: " + sum.GetSum(1, 1));   // 1 Since both are same
    System.out.println("Expected:-1 --- Received: " + sum.GetSum(-1, 0));  //-1 + 0 = -1
    System.out.println("Expected:-1 --- Received: " + sum.GetSum(0, -1));  //-1 + 0 = -1
    System.out.println("Expected: 2 --- Received: " + sum.GetSum(-1, 2));  //-1 + 0 + 1 + 2 = 2 
    System.out.println("Expected: -15 --- Received: " + sum.GetSum(-5, -1));  //-5 + -4 + -3 + -2 + -1 = -15
    System.out.println("Expected: 15 --- Received: " + sum.GetSum(5, 1));  //1 + 2 + 3 + 4 + 5 = 15
    System.out.println();
  }

  public int GetSum(int a, int b)
  {
    System.out.printf("a: %d, b: %d   ", a, b);
    int minimum = Integer.min(a,b), maximum = Integer.max(a,b);
    for (int i = minimum + 1; i <= maximum; i++) { minimum += i; }
    return minimum;
  }
}