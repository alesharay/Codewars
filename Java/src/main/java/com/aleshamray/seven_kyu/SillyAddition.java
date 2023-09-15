package com.aleshamray.seven_kyu;

public class SillyAddition {
  public static int add(int num1, int num2) {
    String result = "";
    String num1String = String.valueOf(num1);
    String num2String = String.valueOf(num2);
    int numOfZeros = Math.abs( num1String.length() - num2String.length() );

    if( numOfZeros > 0 ) {
      if( num1String.length() < num2String.length() ) { num1String = "0".repeat(numOfZeros) + num1String; }
      else { num2String = "0".repeat(numOfZeros) + num2String; }
    }

    for(int i = 0; i < num1String.length(); i++) {
      result += String.valueOf(num1String.charAt(i) - '0' + num2String.charAt(i) - '0');
    }

    return Integer.parseInt(result);
  }
  

  public static void main( String[] args ) {
    System.out.println("****** Real addition ******");
    System.out.println("13 " + SillyAddition.add(2,11));
    System.out.println("1 " + SillyAddition.add(0,1));
    System.out.println("0 " + SillyAddition.add(0,0));   
    System.out.println("4416 " + SillyAddition.add(248, 208));
    System.out.println("211 " + SillyAddition.add(18, 13));
    System.out.println("1113 " + SillyAddition.add(57, 66));
  }
}

