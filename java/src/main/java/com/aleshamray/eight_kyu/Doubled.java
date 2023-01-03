package com.aleshamray.eight_kyu;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Doubled {

  /*
   * Given an array of integers, return a new array with each value doubled.

    For example:

    [1, 2, 3] --> [2, 4, 6]
   */
  public static void main(String[] args) {
    System.out.println( "\nexpected: []\nreceived: " + Arrays.toString(Doubled.map(new int[]{})) );
    System.out.println( "\nexpected: [2, 4, 6]\nreceived: " + Arrays.toString(Doubled.map(new int[] {1, 2, 3})) );
    System.out.println( "\nexpected: [8, 2, 2, 2, 8]\nreceived: " + Arrays.toString(Doubled.map(new int[] {4, 1, 1, 1, 4}))) ; 
    System.out.println( "\nexpected: [2, 2, 2, 2, 2, 2]\nreceived: " + Arrays.toString(Doubled.map(new int[] {1, 1, 1, 1, 1, 1})) );
  }

  public static int[] map(int[] arr) {
    // for each value in the array
    for( int i = 0; i < arr.length; i++ ) {
      // double the value
      arr[i] = arr[i]*2;
    }
    // return the array
    return arr;
  }
}
