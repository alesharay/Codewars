package com.aleshamray.eight_kyu;

class Upper {
  public static String MakeUpperCase(String str) {
    return str.toUpperCase();
  }

  public static void main(String[] args) {
    System.out.printf("\nexpected: \nreceived: %s\n", Upper.MakeUpperCase(""));
    System.out.printf("\nexpected: 1KSHEH\nreceived: %s\n", Upper.MakeUpperCase("1KsheH"));
  }
}

// Write a function which converts the input string to uppercase.
