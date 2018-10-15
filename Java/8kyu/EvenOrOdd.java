// https://www.codewars.com/kata/even-or-odd/solutions/java

public class EvenOrOdd {
    public static String even_or_odd(int number) {
        if(number % 2 == 0) {
            return "Even";
        }
        else {
            return "Odd";
        }
    }

  public static void main(String... args) {
    System.out.println(EvenOrOdd.even_or_odd(6) + " Even");
    System.out.println(EvenOrOdd.even_or_odd(7) + " Odd"); 
  }
}