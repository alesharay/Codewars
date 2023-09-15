package com.aleshamray.seven_kyu;

public class StringValue {

  public static void main(String[] args) {
    System.out.println();
    System.out.printf("expected: true\nreceived: %b\n\n", StringValue.endsWith("samurai", "ai"));
    System.out.printf("expected: false\nreceived: %b\n\n", StringValue.endsWith("sumo", "omo"));
    System.out.printf("expected: true\nreceived: %b\n\n", StringValue.endsWith("ninja", "ja"));
    System.out.printf("expected: true\nreceived: %b\n\n", StringValue.endsWith("sensei", "i"));
    System.out.printf("expected: false\nreceived: %b\n\n", StringValue.endsWith("samurai", "ra"));
    System.out.printf("expected: false\nreceived: %b\n\n", StringValue.endsWith("abc", "abcd"));
    System.out.printf("expected: true\nreceived: %b\n\n", StringValue.endsWith("abc", "abc"));
    System.out.printf("expected: true\nreceived: %b\n\n", StringValue.endsWith("abcabc", "bc"));
    System.out.printf("expected: false\nreceived: %b\n\n", StringValue.endsWith("ails", "fails"));
    System.out.printf("expected: true\nreceived: %b\n\n", StringValue.endsWith("fails", "ails"));
    System.out.printf("expected: false\nreceived: %b\n\n", StringValue.endsWith("this", "fails"));
    System.out.printf("expected: true\nreceived: %b\n\n", StringValue.endsWith("this", ""));
    System.out.printf("expected: false\nreceived: %b\n\n", StringValue.endsWith(":-)", ":-("));
    System.out.printf("expected: true\nreceived: %b\n\n", StringValue.endsWith("!@#$%^&*() :-)", ":-)"));
    System.out.printf("expected: false\nreceived: %b\n\n", StringValue.endsWith("abc\n", "abc"));
    System.out.printf("expected: true\nreceived: %b\n\n", StringValue.endsWith("abc", "abc"));
  }


  // BRUTE FORCE ATTEMPT
  public static boolean endsWith(String str, String ending) {

    // get length of ending string
    int endingLength = ending.length();

    // get length of string
    int stringLength = str.length();

    // if the ending is longer than the current string; return false
    if (endingLength > stringLength) { return false; }

    // take substring of string, starting from string length - ending length
    StringBuilder currentEnding = new StringBuilder(str.substring(stringLength - endingLength));

    // retrun compare the two strings
    return currentEnding.toString().equals(ending);
  }

}

/* Description:
 *
 *     Complete the endsWith so that it returns true if the first argument(string) passed in ends with the 2nd argument (also a string).
 *
 *      Examples:
 *
 *        endsWith('abc', 'bc') // returns true
 *        endsWith('abc', 'd') // returns false
 */