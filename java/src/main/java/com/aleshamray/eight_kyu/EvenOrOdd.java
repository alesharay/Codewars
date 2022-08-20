package com.aleshamray.eight_kyu;

// https://www.codewars.com/kata/even-or-odd/train/java

public class EvenOrOdd {
  // public static String even_or_odd(int number) {
  //     if(number % 2 == 0) {
  //         return "Even";
  //     }
  //     else {
  //         return "Odd";
  //     }
  // }

  public static String even_or_odd(int number) {
    return number % 2 == 0 ? "Even" : "Odd";
  }

  public static void main(String... args) {
    System.out.println(EvenOrOdd.even_or_odd(6) + " Even");
    System.out.println(EvenOrOdd.even_or_odd(7) + " Odd"); 
  }
}