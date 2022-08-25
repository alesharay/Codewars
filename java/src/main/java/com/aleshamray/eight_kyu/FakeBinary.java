package com.aleshamray.eight_kyu;
public class FakeBinary {
  // public static String fakeBin(String numberString) {
  //   // a place to hold the new string
  //   String newString = "";
  //   // for each character in the string 
  //   for(int i = 0; i < numberString.length(); i++) {
  //     // a place to hold the current character, converted to a digit
  //     int digit = Integer.parseInt(numberString.substring(i, i+1));
  //     // if the digit is less than 5
  //     if(digit < 5) {
  //       // replace that character in the string with '0'
  //       newString += "0";
  //     // otherwise
  //     } else {
  //       // replace with '1'
  //       newString += "1";
  //     }
  //   }
  //   // return the string
  //   return newString;
  // }

  // public static String fakeBin(String numberString) {
  //   String newString = "";
  //   for(Character num : numberString.toCharArray()) {
  //     newString += (num - '0') < 5 ? "0" : "1";
  //   }
  //   return newString;
  // }

  public static String fakeBin(String numberString) {
    String newString = "";
    for( Character num : numberString.toCharArray() ) { newString += (num - '0') < 5 ? "0" : "1"; }
    return newString;
  }

  // public static String fakeBin(String numberString) {
  //   return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
  // }

  public static void main(String[] args) {
    System.out.println();
    System.out.println("Expected: 0000111; Received: " + FakeBinary.fakeBin("1234567"));
    System.out.println("Expected: 01000111; Received: " + FakeBinary.fakeBin("09121987"));
    System.out.println("Expected: 10111100; Received: " + FakeBinary.fakeBin("52678810"));
    System.out.println("Expected: 111001111; Received: " + FakeBinary.fakeBin("596229679"));
    System.out.println("Expected: 011101101; Received: " + FakeBinary.fakeBin("385926838"));
  }
}

/* 
  Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'. Return the resulting string.
*/