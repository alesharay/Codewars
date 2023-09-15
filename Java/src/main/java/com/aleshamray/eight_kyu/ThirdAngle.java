package com.aleshamray.eight_kyu;

/*
  You are given two angles (in degrees) of a triangle.
  Write a function to return the 3rd.
  Note: only positive integers will be tested.
*/

public class ThirdAngle {
    public static int otherAngle(int angle1, int angle2) {
      // return 180 - (angle1 + angle2)
      return 180 - (angle1 + angle2);
    }

    public static void main(String[] args) {
      System.out.println();
      System.out.println("Should Equal: 123 ... Equals: " + ThirdAngle.otherAngle(45, 12));
      System.out.println("Should Equal: 70 ... Equals: " + ThirdAngle.otherAngle(50, 60));
    }
}