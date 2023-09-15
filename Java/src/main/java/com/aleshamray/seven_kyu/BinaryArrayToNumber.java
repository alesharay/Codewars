package com.aleshamray.seven_kyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryArrayToNumber {
  public static void main(String[] args) {
      System.out.printf("\nexpected: 0\nreceived: %d\n", BinaryArrayToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList())));
      System.out.printf("\nexpected: 15\nreceived: %d\n", BinaryArrayToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,1,1,1))));
      System.out.printf("\nexpected: 6\nreceived: %d\n", BinaryArrayToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,1,1,0))));
      System.out.printf("\nexpected: 9\nreceived: %d\n", BinaryArrayToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,0,0,1))));
      System.out.printf("\nexpected: 2\nreceived: %d\n", BinaryArrayToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,0,1,0))));
      System.out.printf("\nexpected: 39\nreceived: %d\n", BinaryArrayToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,0,1,0,0,1,1,1))));
      System.out.printf("\nexpected: 11\nreceived: %d\n", BinaryArrayToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,0,1,0,1,1))));
  }


    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
      int result = 0;
      int exponent = binary.size()-1;
      for (Integer num : binary) {
        result += (num * Math.pow(2, exponent));
        --exponent;
      }

      return result;
    }

}


/*
Given an array of ones and zeroes, convert the equivalent binary value to an integer.

Eg: [0, 0, 0, 1] is treated as 0001 which is the binary representation of 1.

Examples:

Testing: [0, 0, 0, 1] ==> 1
Testing: [0, 0, 1, 0] ==> 2
Testing: [0, 1, 0, 1] ==> 5
Testing: [1, 0, 0, 1] ==> 9
Testing: [0, 0, 1, 0] ==> 2
Testing: [0, 1, 1, 0] ==> 6
Testing: [1, 1, 1, 1] ==> 15
Testing: [1, 0, 1, 1] ==> 11
However, the arrays can have varying lengths, not just limited to 4.
 */