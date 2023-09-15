package com.aleshamray.six_kyu;

public class Persist {
  public static void main(String[] args) {
    System.out.printf("\nexpected: 0\nreceived: %d\n", Persist.persistence( 0));
    System.out.printf("\nexpected: 3\nreceived: %d\n", Persist.persistence( 39));
		System.out.printf("\nexpected: 0\nreceived: %d\n", Persist.persistence(  4));
    System.out.printf("\nexpected: 2\nreceived: %d\n", Persist.persistence( 25));
    System.out.printf("\nexpected: 4\nreceived: %d\n", Persist.persistence(999));
    System.out.println();
  }

  public static int persistence(long n) {

    int result;
    int counter = 0;
    String nString = String.valueOf(n);

    while(nString.length() > 1) {
      result = 1;
      String[] nArray = nString.split("");

      for (String num : nArray) {
        result *= Integer.parseInt(num);
      }

      nString = String.valueOf(result);
      counter++;
    }


    // return counter
		return counter;
	}


/*
 * Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence, which is the number of times you must multiply the digits in num until you reach a single digit.
 *
 * For example (Input --> Output):
 *
 * 39 --> 3 (because 3*9 = 27, 2*7 = 14, 1*4 = 4 and 4 has only one digit)
 * 999 --> 4 (because 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, and finally 1*2 = 2)
 * 4 --> 0 (because 4 is already a one-digit number)
 */
}
