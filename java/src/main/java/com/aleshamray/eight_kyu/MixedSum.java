package com.aleshamray.eight_kyu;

/*
  Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.

  Return your answer as a number.
*/

import java.util.Arrays;
import java.util.List;

public class MixedSum {

 /*
  * Assume input will be only of Integer or String type
  */
	public int sum(List<?> mixed) {	
    int total_sum = 0;
    for (int i = 0; i < mixed.size(); ++i)
    {
      if (mixed.get(i) instanceof String)
        total_sum += Integer.parseInt((String) mixed.get(i));
      else
        total_sum += (Integer) mixed.get(i);
    }
		return total_sum;
  }
  
  public static void main(String[] args) {
    MixedSum mixedSum = new MixedSum();

    System.out.println("10 " + mixedSum.sum(Arrays.asList(5, "5")));
    System.out.println("22 " + mixedSum.sum(Arrays.asList(9, 3, "7", "3")));
    System.out.println("42 " + mixedSum.sum(Arrays.asList("5", "0", 9, 3, 2, 1, "9", 6, 7)));
    System.out.println("41 " + mixedSum.sum(Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")));
    System.out.println("45 " + mixedSum.sum(Arrays.asList("1", "5", "8", 8, 9, 9, 2, "3")));
    System.out.println("41 " + mixedSum.sum(Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")));
    System.out.println("61 " + mixedSum.sum(Arrays.asList(8, 0, 0, 8, 5, 7, 2, 3, 7, 8, 6, 7)));
  }
}