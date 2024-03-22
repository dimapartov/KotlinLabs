package lab4

fun main() {
    println("Введите числа:")
    val inputNumbers = readln()
    val splitNumbers = inputNumbers.split(",").map { it.toInt() }
    val averageNumber = splitNumbers.average()
    val greaterThanAverageNumber = splitNumbers.filter { it > averageNumber }
    println("Числа, большие среднего($averageNumber) значения: $greaterThanAverageNumber")
}