// https://www.codewars.com/kata/is-he-gonna-survive

/*
A hero is on his way to the castle to complete his mission. However, he's been told that the castle is surrounded with a couple of powerful dragons! each dragon takes 2 bullets to be defeated, our hero has no idea how many bullets he should carry.. Assuming he's gonna grab a specific given number of bullets and move forward to fight another specific given number of dragons, will he survive?

Return True if yes, False otherwise :)
*/

#include <iostream>
using namespace std;

// bool hero(int bullets, int dragons) {
//   // a place to hold whether the hero will survive
//   bool willSurvive = true;
//   // for each dragon 
//   for(int i = 0; i < dragons; i++) {
//     // if there are less than two bullets remaining
//     if(bullets < 2) {
//       // hero will not survive
//       willSurvive = false;
//       // end here
//       break;
//     }
//     // shoot 2 bullets
//     bullets -= 2;
//   }
//   // return whether or not the hero will survive    
//   return willSurvive;
// }

bool hero(int bullets, int dragons) {
  return bullets - (dragons * 2) >=0;
}

int main(void) {
  cout << hero(10, 5) << " 1" << endl;
  cout << hero(7, 4) << " 0" << endl;
  cout << hero(4, 5) << " 0" << endl;
  cout << hero(100, 40) << " 1" << endl;
  cout << hero(1500, 751) << " 0" << endl;
  cout << hero(0, 1) << " 0" << endl;

  return 0;
}