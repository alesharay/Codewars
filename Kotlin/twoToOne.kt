/*   
  Take 2 strings s1 and s2 including only letters from ato z. Return a new sorted string, the longest possible, containing distinct letters,

  each taken only once - coming from s1 or s2.
  Examples:
  a = "xyaabbbccccdefww"
  b = "xxxxyyyyabklmopq"
  longest(a, b) -> "abcdefklmopqwxy"

  a = "abcdefghijklmnopqrstuvwxyz"
  longest(a, a) -> "abcdefghijklmnopqrstuvwxyz" 
*/

// fun longest(s1: String, s2: String): String {
//   val result = s1 + s2
  
//   var sortedArr = result.toCharArray().sorted().toSet().joinToString("")
  
//   return sortedArr.toString()
// }

fun longest(s1: String, s2: String) = (s1 + s2).toCharArray().sorted().toSet().joinToString("")

fun main(args : Array<String>) {
    println("Expected: aehrsty; Received: ${longest("aretheyhere", "yestheyarehere")}")
    println("Expected: abcdefghilnoprstu; Received: ${longest("loopingisfunbutdangerous", "lessdangerousthancoding")}")
    println("Expected: acefghilmnoprstuy; Received: ${longest("inmanylanguages", "theresapairoffunctions")}")
}