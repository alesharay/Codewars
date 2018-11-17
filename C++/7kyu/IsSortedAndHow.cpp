// https://www.codewars.com/kata/580a4734d6df748060000045

/*
  Complete the method which accepts an array of integers, and returns one of the following:

  "yes, ascending" - if the numbers in the array are sorted in an ascending order
  "yes, descending" - if the numbers in the array are sorted in a descending order
  "no" - otherwise
  You can assume the array will always be valid, and there will always be one correct answer.
*/

#include<iostream>
#include<vector>
using namespace std;

string is_sorted_and_how(vector<int> array)
{
  // a place to store whether the array is sorted in ascending order; assume yes
  bool sortedAscending = true;
  // a place to store whether the array is sorted in descending order; assume yes
  bool sortedDescending = true;
  // for each value in the array
  for(int currentElement = 0; currentElement < array.size()-1; currentElement++){    
    // if the current value is less than the next value
    if(array[currentElement] < array[currentElement+1]) {
      // set sorted in descending order to false
      sortedDescending = false;
    }
    // if the current value is greater than the next value 
    else if(array[currentElement] > array[currentElement+1]) { 
      // set sorted in ascending order to false
      sortedAscending = false;
    }
  }
  // if both sorted orders are false
  if(sortedAscending == false && sortedDescending == false) {
      // return no
      return "no";
  } 
  // or if sorted in ascending is true
  else if(sortedAscending) {    
      // return yes ascending
      return "yes, ascending";
  }
  //  otherwise
  else {
      // return yes descending
    return "yes, descending"; 
  }
}

int main(int argc, char** argv) {
  cout << endl;
  cout << is_sorted_and_how({1, 2}) << "  yes, ascending" << endl;
  cout << is_sorted_and_how({15, 7, 3, -8}) << "  yes, descending" << endl;
  cout << is_sorted_and_how({4, 2, 30}) << "  no" << endl;
  return 0;
}