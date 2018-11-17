// https://www.codewars.com/kata/580a4734d6df748060000045

/*
  Complete the method which accepts an array of integers, and returns one of the following:

  "yes, ascending" - if the numbers in the array are sorted in an ascending order
  "yes, descending" - if the numbers in the array are sorted in a descending order
  "no" - otherwise
  You can assume the array will always be valid, and there will always be one correct answer.
*/

#include<string>
#include<iostream>
#include<math.h>
#include<vector>
using namespace std;

string is_sorted_and_how(vector<int> array)
{
    return "undefined"; 
}

int main(int argc, char** argv) {
  cout << endl;
  cout << is_sorted_and_how({1, 2}) << "  yes, ascending" << endl;
  cout << is_sorted_and_how({15, 7, 3, -8}) << "  yes, descending" << endl;
  cout << is_sorted_and_how({4, 2, 30}) << "  no" << endl;
  return 0;
}