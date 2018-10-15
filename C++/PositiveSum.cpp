// https://www.codewars.com/kata/sum-of-positive/train/cpp

/*
You get an array of numbers, return the sum of all of the positives ones.
  Example [1,-4,7,12] => 1 + 7 + 12 = 20
Note: if there is nothing to sum, the sum is default to 0.
*/

#include <vector>
#include <iostream>
using namespace std;

int positive_sum (const std::vector<int> arr){
  return 0;
}

int main(int argc, char** argv) {
  cout << positive_sum(vector <int> {1,2,3,4,5}) << " 15" << endl;
  cout << positive_sum(vector <int> {1,-2,3,4,5}) << " 13" << endl;
  cout << positive_sum(vector <int> {-1,2,3,4,-5}) << " 9" << endl;
  return 0;
}