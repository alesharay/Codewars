package com.aleshamray.eight_kyu;

public class RemoveTime {
  public static String shortenToDate(String longDate) {
    return longDate.split(",")[0];
  }

  public static void main(String... args) {
    System.out.println();
    System.out.println(RemoveTime.shortenToDate("Friday May 2, 7pm") + "   Friday May 2");
    System.out.println();
    System.out.println(RemoveTime.shortenToDate("Friday May 2, 9am") + "   Friday May 2");
    System.out.println();
    System.out.println(RemoveTime.shortenToDate("Tuesday January 29, 10pm") + "   Tuesday January 29");
    System.out.println();
    System.out.println(RemoveTime.shortenToDate("Monday December 25, 10pm") + "   Monday December 25");
    System.out.println();
  }
}


// https://www.codewars.com/kata/remove-the-time

/*
Description:
Task Description

You're re-designing a blog, and the blog's posts have the Weekday Month Day, time format for showing the date and time when a post was made, e.g., Friday May 2, 7pm.

You're running out of screen real estate, and on some pages you want to display a shorter format, Weekday Month Day that omits the time.

Write a function that takes the website date/time in its original string format and returns the shortened format.
Input

Input will always be a string, e.g., "Friday May 2, 7pm".
Output

Output will be the shortened string, e.g., "Friday May 2".
*/