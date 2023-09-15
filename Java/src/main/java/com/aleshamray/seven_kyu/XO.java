package com.aleshamray.seven_kyu;

/*
  Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contain any char.

  Examples input/output:

  XO("ooxx") => true
  XO("xooxx") => false
  XO("ooxXm") => true
  XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
  XO("zzoo") => false
*/


public class XO {
  
  public static void main (String... args) {
    System.out.println(getXO("ooxx") + " " + true);
    System.out.println(getXO("xooxx") + " " + false);
    System.out.println(getXO("ooxXm") + " " + true);
    System.out.println(getXO("zpzpzpp") + " " + true); // when no 'x' and 'o' is present should return true
    System.out.println(getXO("zzoo") + " " + false);
  }

  public static boolean getXO (String str) {
    int Xs = 0, Os = 0;
    for (Character c : str.toCharArray()) {
      if (Character.toLowerCase(c) == 'x') Xs++;
      else if (Character.toLowerCase(c) == 'o') Os++;
    }
    return Xs == Os;
  }
}