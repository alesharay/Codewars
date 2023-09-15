package com.aleshamray.seven_kyu;

/*
  An abundant number or excessive number is a number for which the sum of its proper divisors is greater than the number itself. (A proper divisor of a positive integer is any divisor of other than itself.)

  The integer 12 is the first abundant number. Its proper divisors are 1, 2, 3, 4 and 6 for a total of 16 (> 12).

  Derive function abundantNumber(num)/abundant_number(num) which returns true/True/.true. if num is abundant, false/False/.false. if not.
*/

public class EAN {
    
  public static boolean abundantNumber1(int num) {
    int total_sum = 0;
    int divisors = 0;
    while (divisors++ < ((num/2))){
      if (num % divisors == 0)
        total_sum += divisors;
    }
    return (total_sum > num ? true : false);
  }

  public static boolean abundantNumber(int num) {
    int total_sum = 0; 
    int divisors = 0;
    while (divisors++ < ((num/2)))
      if (num % divisors == 0)
        total_sum += divisors;
        
    return total_sum > num;
  }
  
  public static void main(String[] args) {
    System.out.println("true " + EAN.abundantNumber(12));
    System.out.println("true " + EAN.abundantNumber(18));
    System.out.println("false " + EAN.abundantNumber(37));
    System.out.println("false " + EAN.abundantNumber(77));
  }
}