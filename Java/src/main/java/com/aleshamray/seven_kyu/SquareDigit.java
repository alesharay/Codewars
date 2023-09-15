package com.aleshamray.seven_kyu;

/*
  - Welcome. In this kata, you are asked to square every digit of a number.
  - For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.
  - Note: The function accepts an integer and returns an integer
*/

public class SquareDigit {

  public static void main (String... args) {
    System.out.println("811181 --- " + new SquareDigit().squareDigits(9119));
    System.out.println("14916 --- " + new SquareDigit().squareDigits(1234));
    System.out.println("25364964 --- " + new SquareDigit().squareDigits(5678));
    System.out.println("0 --- " + new SquareDigit().squareDigits(0));
  }

  // public int squareDigits (int n) {
  //   String result = "";
  //   for (Character c : String.valueOf(n).toCharArray()) {
  //     int num = Integer.parseInt(c.toString());
  //     num = num * num;
  //     result += String.valueOf(num);
  //   }
  //   return Integer.parseInt(result);
  // }

  // public int squareDigits (int n) {
  //   String result = "";
  //   for (Character c : String.valueOf(n).toCharArray()) {
  //     int num = Integer.parseInt(c.toString());
  //     result += String.valueOf(num * num);
  //   }
  //   return Integer.parseInt(result);
  // }

    public int squareDigits (int n) {
    String result = "";
    for (String c : String.valueOf(n).split("")) 
      result += String.valueOf((int)Math.pow(Integer.parseInt(c), 2));
    return Integer.parseInt(result);
  }
}