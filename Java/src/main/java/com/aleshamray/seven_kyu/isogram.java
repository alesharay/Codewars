package com.aleshamray.seven_kyu;

/*
  An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a function that determines whether a string that contains only letters is an isogram. Assume the empty string is an isogram. Ignore letter case.
*/

public class isogram {
  public static boolean  isIsogram(String str) {
    for(int i = 0; i < str.length(); i++) {
      String letter = String.valueOf(str.charAt(i)).toLowerCase();
      String remainingString = str.substring(i+1).toLowerCase();
      if(remainingString.contains(letter)) { return false; }
    }
    return true;
  } 

  public static void main(String[] args) {
    System.out.println("Expected: true,  Received: " + isogram.isIsogram("Dermatoglyphics"));
    System.out.println("Expected: true,  Received: " + isogram.isIsogram("isogram"));
    System.out.println("Expected: false, Received: " + isogram.isIsogram("moose"));
    System.out.println("Expected: false, Received: " + isogram.isIsogram("isIsogram"));
    System.out.println("Expected: false, Received: " + isogram.isIsogram("aba"));
    System.out.println("Expected: false, Received: " + isogram.isIsogram("moOse"));
    System.out.println("Expected: true,  Received: " + isogram.isIsogram("thumbscrewjapingly"));
    System.out.println("Expected: true,  Received: " + isogram.isIsogram("")); 
  }
}