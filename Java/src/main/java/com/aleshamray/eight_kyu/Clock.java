package com.aleshamray.eight_kyu;

public class Clock {

  public static void main(String[] args) {
    System.out.println();
    System.out.printf("expected: 61000\nreceived: %d\n\n", Clock.Past(0, 1, 1));
    System.out.printf("expected: 0\nreceived: %d\n\n", Clock.Past(0, 0, 0));
    System.out.printf("expected: 86399000\nreceived: %d\n\n", Clock.Past(23, 59, 59));
  }

  public static int Past(int h, int m, int s) {
    // Happy Coding! ^_^

    int result = h*60*60*1000 + m*60*1000 + s*1000;

    return result;
  }

}

/*
 * DESCRIPTION:
 * Clock shows h hours, m minutes and s seconds after midnight.
 * 
 * Your task is to write a function which returns the time since midnight in
 * milliseconds.
 * 
 * Example:
 * h = 0
 * m = 1
 * s = 1
 * 
 * result = 61000
 * Input constraints:
 * 
 * 0 <= h <= 23
 * 0 <= m <= 59
 * 0 <= s <= 59
 * 
 */
