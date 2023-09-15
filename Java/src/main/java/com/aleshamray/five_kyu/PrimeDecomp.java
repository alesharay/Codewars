package com.aleshamray.five_kyu;

import java.util.Map;

/*

  Given a positive number n > 1 find the prime factor decomposition of n. The result will be a string with the following form :

 "(p1**n1)(p2**n2)...(pk**nk)"
  where a ** b means a to the power of b

  with the p(i) in increasing order and n(i) empty if n(i) is 1.

  Example: n = 86240 should return "(2**5)(5)(7**2)(11)"
  
*/

/*
  I: a positive number

  O: prime factor decomposition
    - all of the factors of the number down to their smallest primes
    - if a prime exists multiple times, take it to the power of the number of times
    - p is the prime, n is the number of times it shows
    - display should be in the form (p1**n1)(p2**n2)...(pk**nk)

  G:
    - n is greater than 1
    - the result is a string
    - n is an integer (32 bit)
    - if the prime only shows once, just show the prime (not the prime to the first power)

  E:
    - n equals 1
      * return (1)
    - n equals the max integet
      * do the same thing if n is not the max integer

  A:
    - n can be both prime and composite
    - if the number is prime, just return the number

*/

import java.util.TreeMap;

public class PrimeDecomp {

  public static String factors(int n) {
    System.out.printf( "\nn: %d", n);
    
    if(n < 4) return String.format("(%d)", n);

    Map<Integer, Integer> counts = new TreeMap<>();    
    boolean nHasChanged = true;
    while(nHasChanged) {
      nHasChanged = false;
      for(int i = 2; i <= Math.sqrt(n)+1; i++) {
        int count = counts.get(i) == null ? 0 : counts.get(i);
        if(n % i == 0 && n > 1) {
          count++;
          counts.put(i, count);
          n /= i;
          nHasChanged = true;
          break;
        }
      }
    }

    if(n > 1)
      counts.put(n, counts.get(n) == null ? 1 : counts.get(n) + 1);

    String result = "";
    for(Map.Entry<Integer,Integer> entry : counts.entrySet()) {
      int key = entry.getKey();
      int count = entry.getValue();

      result += (count > 1 ? String.format("(%d**%d)", key, count) : 
                 count == 1 ? String.format("(%d)", key) : "");
    }

    return result;
  }

  public static void main(String[] args) {
    // TODO: Do Something
    System.out.printf( "\nExpected: (1)\nReceived: %s\n", PrimeDecomp.factors(1) );
    System.out.printf( "\nExpected: (2**3)\nReceived: %s\n", PrimeDecomp.factors(8) );
    System.out.printf( "\nExpected: (2)(5)\nReceived: %s\n", PrimeDecomp.factors(10) );
    System.out.printf( "\nExpected: (2**4)(3)\nReceived: %s\n", PrimeDecomp.factors(48) );
    System.out.printf( "\nExpected: (2**2)(3**3)(5)(7)(11**2)(17)\nReceived: %s\n", PrimeDecomp.factors(7775460) );
    System.out.printf( "\nExpected: (2147483647)\nReceived: %s\n", PrimeDecomp.factors(Integer.MAX_VALUE) );
  }
}
