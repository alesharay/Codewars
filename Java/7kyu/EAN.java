
/*
  An abundant number or excessive number is a number for which the sum of its proper divisors is greater than the number itself. (A proper divisor of a positive integer is any divisor of other than itself.)

  The integer 12 is the first abundant number. Its proper divisors are 1, 2, 3, 4 and 6 for a total of 16 (> 12).

  Derive function abundantNumber(num)/abundant_number(num) which returns true/True/.true. if num is abundant, false/False/.false. if not.
*/

public class EAN {
    
  public static boolean abundantNumber(int num) {
    // a place to store the total sum

    // for each number less than the number itself

      // if the current number is a divisor of the number

        // add the current number to the total sum

    // return whether the total sum is more than the number or not
    return true;
  }
  
  public static void main(String[] args) {
    System.out.println("true " + EAN.abundantNumber(12));
    System.out.println("true " + EAN.abundantNumber(18));
    System.out.println("false " + EAN.abundantNumber(37));
    System.out.println("false " + EAN.abundantNumber(77));
  }
}