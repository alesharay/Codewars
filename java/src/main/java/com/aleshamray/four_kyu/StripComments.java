package com.aleshamray.four_kyu;

/*
  Complete the solution so that it strips all text that follows any of a set of comment markers passed in. Any whitespace at the end of the line should also be stripped out.

  Example:

  Given an input string of:

  apples, pears # and bananas
  grapes
  bananas !apples
  The output expected would be:

  apples, pears
  grapes
  bananas
  The code would be called like so:

  var result = solution("apples, pears # and bananas\ngrapes\nbananas !apples", ["#", "!"])
  result should == "apples, pears\ngrapes\nbananas"
*/

public class StripComments {

  public static String stripComments(String text, String[] commentSymbols) {
    String[] lines = text.split("\n");
      for(int i = 0; i < lines.length; i++) {
          for(String commentSymbol: commentSymbols) {
              int position = lines[i].indexOf(commentSymbol);
              if(position >= 0) {
                  lines[i] = lines[i].substring(0, position);
              }
              lines[i] = lines[i].stripTrailing();
          }
      }
      return String.join("\n", lines);
  }

  
  public static void main(String[] args) {
    System.out.println();
    System.out.println( "Expected:\napples, pears\n\ngrapes\nbananas\n\nRecieived:\n" +
    StripComments.stripComments( "apples, pears # and bananas\n\ngrapes\nbananas !apples", new String[] { "#", "!" } ));
    System.out.println();

    System.out.println();
    StripComments.stripComments( "a #b\nc\nd $e f g", new String[] { "#", "$" });
    System.out.println();

    System.out.println();
    System.out.println( "Expected:\n\na\n b\nc\n\nReceived:\n" +
    StripComments.stripComments( "\na\n b \nc", new String[] { "#", "$" } ));
    System.out.println();
  }
}