package com.aleshamray.eight_kyu;

/*
  I: A string

  O: Number of duplicates that appear
    - (aabbccddee) : result = 5 (a, b, c, d, e are all duplicates)
  E:
    -text is empty
      return 0
    -text is of size 1
      return 0
      
      text is larger than size 1
      X | create a map of key (string) and value (int) pairs 
      Y | turn the string into a stream and give all unique values and collect as a list
      Y | for each value in the list of unique values
      X | the value as the key, and the number of times the value appears (use count function) as the value
      Y | result (int) for each value that is more than 1, increment and return
  G: 
    - calculation is based on case insensitive values
    - result should only count numbers and letters
    - string will only contain numbers and letters

  A:
    - text can be any size
    - text will not be null
*/

import java.util.*;

public class CountingDuplicates {

// COOL MODERN ATTEMPT
// public static int duplicateCount(String text) {
//   System.out.println( text );

//   if(text.length() == 0 || text.length() == 1) return 0; 

//   List<String> uniques = Arrays.stream(text.split("")).map(String::toLowerCase).distinct().collect(Collectors.toList());

//   int result = 0;
//   for(String str : uniques) {
//     int count = (int) Arrays.stream(text.split("")).filter(let -> let.equals(str.toLowerCase()) || let.equals(str.toUpperCase())).count();
//     if(count > 1) result++;
//   }

//   return result;
// }

  // BRUTE FORCE : MORE LEGIBLE ATTEMPT
  public static int duplicateCount(String text) {
    System.out.println( text );

    if(text.length() == 0 || text.length() == 1) return 0; 
      
    int result = 0;
    Map<String, Integer> pairs = new HashMap<>();

    for(String str : text.split("")) {
      str = str.toLowerCase();
      int count = -1;
      if(pairs.get(str) != null)
        count = pairs.get(str);
      pairs.put(str, ++count);
    }

    for(Map.Entry<String, Integer> pair : pairs.entrySet()) {
      if(pair.getValue() > 0) result++;
    }

    return result;
  }

  public static void main(String[] args) {
    String expected2 = "Expected: 2\nReceived: ";
    System.out.println("Expected: 0\nReceived: " + duplicateCount("abcde")); // -> 0 # no characters repeats more than once
    System.out.println();
    System.out.println("Expected: 5\nReceived: " + duplicateCount("aaabbccccddeee")); // -> 5 # all characters repeats more than once
    System.out.println();
    System.out.println(expected2 + duplicateCount("aabbcde")); // -> 2 # 'a' and 'b'
    System.out.println();
    System.out.println(expected2 + duplicateCount("aabBcde")); // -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
    System.out.println();
    System.out.println("Expected: 1\nReceived: " + duplicateCount("indivisibility")); // -> 1 # 'i' occurs six times
    System.out.println();
    System.out.println(expected2 + duplicateCount("Indivisibilities")); // -> 2 # 'i' occurs seven times and 's' occurs twice
    System.out.println();
    System.out.println(expected2 + duplicateCount("aA11")); // -> 2 # 'a' and '1'
    System.out.println();
    System.out.println(expected2 + duplicateCount("ABBA")); // -> 2 # 'A' and 'B' each occur twice
  }
}
