/*
  Subtract the sum
  NOTE! This kata can be more difficult than regular 8-kyu katas

  Complete the function which gets an input number n such that n >= 10 and n < 10000, then:

  Sum all the digits of n.
  Subtract the sum from n, and it is your new n.
  If the new n is in the list below return the associated fruit, otherwise return back to task 1.
  Example
  n = 325
  sum = 3+2+5 = 10
  n = 325-10 = 315 (not in the list)
  sum = 3+1+5 = 9
  n = 315-9 = 306 (not in the list)
  sum = 3+0+6 = 9
  n =306-9 = 297 (not in the list)
  . .
  . ...until you find the first n in the list below.

  There is no preloaded code to help you. This is not about coding skills; think before you code
*/

fun main() {
  print(subtractSum(10)+"\n")
}

fun subtractSum(n: Int): String {
  var newN = n
    if( n in 10..9999) {
      do {
        var nString = newN.toString()
        var sum = 0
        for(value in nString) {
          sum += Character.getNumericValue(value) 
        }
        newN -= sum
      } while( newN !in 1..10 )
    }
    return getFruit(newN)
}

fun getFruit(n: Int): String {
  val fruits = listOf(
    "kiwi",
    "pear",
    "kiwi",
    "banana",
    "melon",
    "banana",
    "melon",
    "pineapple",
    "apple",
    "pineapple"
  )
  return fruits.get(n-1)
}