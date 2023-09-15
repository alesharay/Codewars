/** Narcissistic 
 * https://www.codewars.com/kata/5287e858c6b5a9678200083c
 * 
 * Name: Alesha Ray
 * Email: alesha.ray@g.austincc.edu
 * Date: 11/16/2018
 */

/*
  A Narcissistic Number is a number which is the sum of its own digits, each raised to the power of the number of digits in a given base. In this Kata, we will restrict ourselves to decimal (base 10).

  For example, take 153 (3 digits):
  1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153

  and 1634 (4 digits):
  1^4 + 6^4 + 3^4 + 4^4 = 1 + 1296 + 81 + 256 = 1634

The Challenge:

  Your code must return true or false depending upon whether the given number is a Narcissistic number in base 10.

  Error checking for text strings or other invalid inputs is not required, only valid integers will be passed into the function.

*/

#include <iostream>
#include <string.h>
#include <math.h>

using namespace std;

// bool narcissistic( int value ) {
// // break the value into an array with each number as a separate element
//   // a place to hold the length of the value
//   int length = to_string(value).length();
//   // a place to hold the value array
//   int valArr[length];
//   // a place to store a counter
//   int i = 0;
//   // a place to hold a temp value set to value
//   int tempVal = value;
//   // a place to hold a temp length set to length
//   int tempLength = length;
//   // while the length is greater than 0
//   while(--tempLength >= 0) {
//     // a place to hold the current exponent
//     double divisor = pow(10.0, (double)tempLength);
//     // store the value divided by 10 to the length in the current element of the array
//     valArr[i] = tempVal / divisor;
//     // subtract the value by the highest place
//     tempVal -= valArr[i] * divisor;
//     // increment the counter
//     i++;
//   }

//   // a place to store the sum
//   int sum = 0;
//   // for each value in the array
//   for(int val : valArr) { 
//     // add the value, taken to the length of the array, to the sum
//     sum += pow((double)val, (double)length);
//   }

//   // if the sum equals the value
//     // return true
//   // otherwise
//     // return false
//   return (sum == value);
// }

bool narcissistic( int value ){
  int length = to_string(value).length();
  int tempLength = length;
  int valArr[length];
  int tempVal = value;
  int i = 0;
  int sum = 0;
  while(--tempLength >= 0) {
    double divisor = pow(10.0, (double)tempLength);
    valArr[i] = tempVal / divisor;
    tempVal -= valArr[i] * divisor;
    sum += pow((double)valArr[i], (double)length);
    i++;
  }
  return (sum == value);
}

int main(int argc, char** argv) {
  cout << narcissistic(7) << " " << true << endl;
  cout << narcissistic(371) << " " << true << endl;
  cout << narcissistic(122) << " " << false << endl;
  cout << narcissistic(4887) << " " << false << endl;
  return 0;
}