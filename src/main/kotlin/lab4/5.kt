package lab4

fun main() {
    println("Введите числа:")
    val input = readln()
    val numbers = input.split(",").map { it.toInt() }
    val sortedNumbers = numbers.sorted()
    println(sortedNumbers)
}