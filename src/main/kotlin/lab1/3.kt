package lab1

fun main() {
    val inputNumber = readln() //5934
    if (inputNumber.length != 4 || !inputNumber.all { it.isDigit() }) {
        throw IllegalArgumentException("Введите число, состоящее из четырех цифр")
    }
    val digits = inputNumber.map { it }.joinToString(", ")
    println(digits)
}