package com.aleshamray.eight_kyu;
/*
  The Story:

  Bob is working as a bus driver. However, he has become extremely popular amongst the city's residents. With so many passengers wanting to get aboard his bus, he sometimes has to face the problem of not enough space left on the bus! He wants you to write a simple program telling him if he will be able to fit all the passengers.

  Task Overview:
  You have to write a function that accepts three parameters:

  [cap] is the amount of people the bus can hold excluding the driver.
  [on] is the number of people on the bus.
  [wait] is the number of people waiting to get on to the bus.

  If there is enough space, return 0, and if there isn't, return the number of passengers he can't take.
*/

public class Bob {
  public static int enough(int cap, int on, int wait)
  {
    /*
    // if capacity minus on is greater than wait
    if ( (cap - on) > wait)
      // return o
      return 0;
    // otherwise
    else
      // return wait minus (capacity - on)
      return wait - (cap - on);
    */
    
    return (cap - on) > wait ? 0 : wait - (cap - on);
  }

  public static void main(String... args) 
  {
    System.out.println("Should return 10: " +  Bob.enough(100, 60, 50));
    System.out.println("Should return 0: " +  Bob.enough(10, 5, 5));
  }
}