package com.aleshamray.seven_kyu;

/*
  ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.

  If the function is passed a valid PIN string, return true, else return false.

  Examples (Input --> Output)
  "1234"   -->  true
  "12345"  -->  false
  "a234"   -->  false
*/

public class ValidatePinCode {

  public static void main(String... args) {
    System.out.println();
    System.out.println("true " + ValidatePinCode.validatePin("1234"));
    System.out.println("false " + ValidatePinCode.validatePin("12345"));
    System.out.println("true " + ValidatePinCode.validatePin("0000"));
    System.out.println("true " + ValidatePinCode.validatePin("1111"));
    System.out.println("true " + ValidatePinCode.validatePin("123456"));
    System.out.println("false " + ValidatePinCode.validatePin("2a34d6"));
    System.out.println("true " + ValidatePinCode.validatePin("098765"));
    System.out.println("true " + ValidatePinCode.validatePin("000000"));
    System.out.println("true " + ValidatePinCode.validatePin("090909"));
    System.out.println();
  }

  public static boolean validatePin(String pin) {
    if (pin.length() != 4 && pin.length() != 6) return false; 
    for(Character character : pin.toCharArray()) {
      if(!Character.isDigit(character)) return false;
    }
    return true; 
  }
}
