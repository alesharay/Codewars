package com.aleshamray.eight_kyu;

import java.util.Arrays;
import java.util.Collections;

/* 
  I:  A "long" value 

  O:  An "integer" array of the long value in reverse order
    - ex. n = 12345
          return: [5,4,3,2,1]

  E: 
    - The number is of size 1
      * return an int array of that value
    - return a number array in reverse order

  A:
    - The sorting of numbers don't matter
    - The number can be of positve or 0
    - The number is not null
*/

public class Digitize {

  public static int[] digitize(long n) {
    String[] strArr = Long.toString(n).split("");

    if(strArr.length == 1) return new int[]{(int)n};

    Collections.reverse(Arrays.asList(strArr));  
    return Arrays.stream(strArr).mapToInt(val -> Integer.parseInt(val)).toArray();
  }
  
  public static void main(String[] args) {

    Long A = 35231L;
    System.out.print( "\nExpected: [1,3,2,5,3,]\nReceived: ["); Arrays.stream(Digitize.digitize(A)).forEach(num -> System.out.print(num + ",")); System.out.println( "]\n" );

    A = 348597L;
    System.out.print( "\nExpected: [7,9,5,8,4,3,]\nReceived: ["); Arrays.stream(Digitize.digitize(A)).forEach(num -> System.out.print(num + ",")); System.out.println( "]\n" );

    A = 0L;
    System.out.print( "\nExpected: [0,]\nReceived: ["); Arrays.stream(Digitize.digitize(A)).forEach(num -> System.out.print(num + ",")); System.out.println( "]\n" );   
  }
}