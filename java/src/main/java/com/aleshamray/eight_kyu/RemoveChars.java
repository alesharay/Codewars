package com.aleshamray.eight_kyu;

/*
  It's pretty straightforward. Your goal is to create a function that removes the first and last characters of a string. 
  You're given one parameter, the original string. You don't have to worry with strings with less than two characters.
*/

public class RemoveChars {
  public static void main(String ... args) {
    System.out.println("loquen " + RemoveChars.remove("eloquent"));
    System.out.println("ountr "  + RemoveChars.remove("country"));
    System.out.println("erso "   + RemoveChars.remove("person"));
    System.out.println("lac "    + RemoveChars.remove("place"));
  }

  public static String remove(String str) {
    return str.substring(1, str.length()-1);
  }
}