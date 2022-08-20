package com.aleshamray.seven_kyu;

/*
  - Trolls are attacking your comment section!
  - A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.
  - Your task is to write a function that takes a string and return a new string with all vowels removed.
  - For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".
  **Note: for this kata y isn't considered a vowel.**
*/

public class Disemvowel {
  public static void main(String ... args) {
    System.out.println();
    System.out.println("Expected: Ths wbst s fr lsrs LL!" + "\nreceived: " + Disemvowel.disemvowel("This website is for losers LOL!") + "\n");
    System.out.println("Expected: N ffns bt,\nYr wrtng s mng th wrst 'v vr rd" + "\nreceived: " + Disemvowel.disemvowel("No offense but,\nYour writing is among the worst I've ever read")  + "\n");
    System.out.println("Expected: Wht r y,  cmmnst?" + "\nreceived: " + Disemvowel.disemvowel("What are you, a communist?" + "\n"));
    System.out.println();
  }

  // public static String disemvowel(String str) {
  //   StringBuilder newString = new StringBuilder();
  //   String vowels = "aeiouAEIOU";

  //   for (Character c : str.toCharArray()) {
  //     if (!vowels.contains(c.toString())) {
  //       newString.append(c);
  //     }
  //   }
  //   return newString.toString();
  // }

  public static String disemvowel(String str) {
     return str.replaceAll("[aeiouAEIOU]", "");
  }
}