package lab5

import kotlin.math.abs

fun main() {
    println(roundNumber(-1272))
    println(roundNumber(123))
}

fun roundNumber(number:Int):String {
    if (abs(number) >= 1000) {
        return "${number / 1000}K"
    } else {
        return number.toString()
    }
}