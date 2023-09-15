package com.aleshamray.eight_kyu;

public class OppositesAttract {
  public static void main(String[] args) {
    System.out.printf("\nexpected: true\nreceived: %b\n", OppositesAttract.isLove(1, 4));
    System.out.printf("\nexpected: false\nreceived: %b\n", OppositesAttract.isLove(2, 2));
    System.out.printf("\nexpected: false\nreceived: %b\n", OppositesAttract.isLove(1, 1));
    System.out.printf("\nexpected: true\nreceived: %b\n", OppositesAttract.isLove(0, 1));
  }
  
  public static boolean isEven(int num) {
    return num % 2 == 0;
  }

  // BRUTE FORCE SOLUTION
  // public static boolean isLove(final int flower1, final int flower2) {

  //   // if flower1 is even and flower2 is odd; return true
  //   if (isEven(flower1) && !isEven(flower2)) return true;
    
  //   // if flower1 is odd and flower2 is even; return true
  //   if (!isEven(flower1) && isEven(flower2)) return true;

  //   // return false
  //   return false;
  // }

  // public static boolean isLove(final int flower1, final int flower2) {
  //   return (flower1 % 2) != (flower2 % 2);
  // }

  public static boolean isLove(final int flower1, final int flower2) {
    return (flower1 + flower2) % 2 == 1;
  }
}


/*
 * Timmy & Sarah think they are in love, but around where they live, they will only know once they pick a flower each. 
 * If one of the flowers has an even number of petals and the other has an odd number of petals it means they are in love.
 *
 * Write a function that will take the number of petals of each flower and return true if they are in love and false if they aren't.
 */