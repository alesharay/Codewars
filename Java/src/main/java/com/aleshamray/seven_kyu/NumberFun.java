package com.aleshamray.seven_kyu;

public class NumberFun {
  public static void main(String[] args) {
    System.out.println();
    System.out.printf("expected: 144\nreceived: %d\n\n", NumberFun.findNextSquare(121));
    System.out.printf("expected: 1\nreceived: %d\n\n", NumberFun.findNextSquare(0));
    System.out.printf("expected: 4\nreceived: %d\n\n", NumberFun.findNextSquare(1));
    System.out.printf("expected: 676\nreceived: %d\n\n", NumberFun.findNextSquare(625));
    System.out.printf("expected: -1\nreceived: %d\n\n", NumberFun.findNextSquare(114));
    System.out.printf("expected: 36\nreceived: %d\n\n", NumberFun.findNextSquare(25));
    System.out.printf("expected: 15241630849\nreceived: %d\n\n", NumberFun.findNextSquare(15241383936L));
  }

  public static long findNextSquare(long sq) {
    System.out.println(sq);
    if( sq == 0 ) return 1;
    Double root = Math.sqrt(Long.valueOf(sq).doubleValue());
    if( ! root.toString().endsWith(".0")  ) return -1;

    return Double.valueOf(Math.pow(root + 1, 2)).longValue(); 
  }
}

/*
 * You might know some pretty large perfect squares. But what about the NEXT one?
 * 
 * Complete the findNextSquare method that finds the next integral perfect square after the one passed as a parameter. Recall that an integral perfect square is an integer n such that sqrt(n) is also an integer.
 * 
 * If the parameter is itself not a perfect square then -1 should be returned. You may assume the parameter is non-negative.
 * 
 * Examples:(Input --> Output)
 * 
 * 121 --> 144
 * 625 --> 676
 * 114 --> -1 since 114 is not a perfect square
 */