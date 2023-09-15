/*  
  In a factory a printer prints labels for boxes. For one kind of boxes the printer has to use colors which, for the sake of simplicity, are named with letters from a to m.

  The colors used by the printer are recorded in a control string. For example a "good" control string would be aaabbbbhaijjjm meaning that the printer used three times color a, four times color b, one time color h then one time color a...

  Sometimes there are problems: lack of colors, technical malfunction and a "bad" control string is produced e.g. aaaxbbbbyyhwawiwjjjwwm with letters not from a to m.

  You have to write a function printer_error which given a string will output the error rate of the printer as a string representing a rational whose numerator is the number of errors and the denominator the length of the control string. Don't reduce this fraction to a simpler expression.

  The string has a length greater or equal to one and contains only letters from ato z.
*/

/* 
  fun printerError(s: String): String {
    val accLetters = "nNoOpPqQrRsStTuUvVwWxXyYzZ"
    var errorCount = 0
    for(letter in s) {
      if(accLetters.contains(letter)) errorCount++
    }
    return "$errorCount/${s.length}"
  }
*/

/* 
  fun printerError(s: String): String {
    var errorCount = s.asSequence()
    .filter { letter -> "nNoOpPqQrRsStTuUvVwWxXyYzZ".contains(letter) }
    .count()

  return "$errorCount/${s.length}"
  }
*/

fun printerError(s: String) = "${s.count {it in 'n'..'z'}}/${s.length}"

fun main(args: Array<String>) {
  println("Expected: 3/56; Received: ${printerError("aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz")}")
  println("Expected: 6/60; Received: ${printerError("kkkwwwaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz")}")
  println("Expected: 11/65; Received: ${printerError("kkkwwwaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyzuuuuu")}")
  println("Expected: 0/53; Received: ${printerError("aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmm")}")
}