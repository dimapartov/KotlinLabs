package lab4

fun main() {
    val numbers = mutableListOf<Int>()
    println("Введите числа:")
    val inputNumbers = readln()
    val splitNumbers = inputNumbers.split(",")
    for (number in splitNumbers) {
        val resultNumber = number.trim().toInt()
        numbers.add(resultNumber)
    }
    val min = numbers.min()
    val max = numbers.max()
    println("Минимальный элемент: $min")
    println("Максимальный элемент: $max")
}