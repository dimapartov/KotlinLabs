package lab2

fun main() {
    val firstNumber = readln().toInt()
    val secondNumber = readln().toInt()
    val bothNumbersEven = if (firstNumber % 2 == 0 && secondNumber % 2 == 0) true else false

    println(bothNumbersEven)
}