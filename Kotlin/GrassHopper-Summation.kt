object GrassHopper {
    // fun summation(n:Int):Int {
    //     var sum = 0
    //     for(i in 0..n) sum += i
    //     return sum
    // }

    // fun summation(n:Int) = n.downTo(0).reduce{acc, i -> acc + i}

    fun summation(n: Int) = (1..n).sum()
}

fun main() {
    println(GrassHopper.summation(8))
}

/*
    Summation
    Write a program that finds the summation of every number from 1 to num. The number will always be a positive integer greater than 0.

    For example:

    summation(2) -> 3
    1 + 2

    summation(8) -> 36
    1 + 2 + 3 + 4 + 5 + 6 + 7 + 8
*/