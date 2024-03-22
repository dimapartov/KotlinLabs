package lab4

fun main() {
    println("Введите числа:")
    val inputNumbers = readln()
    val numbers = inputNumbers.split(",").map { it.toInt() }
    if (numbers.size >= 2) {
        val sortedNumbers = numbers.sorted()
        println(sortedNumbers[1])
    } else {
        println("Введите минимум два числа")
    }
}