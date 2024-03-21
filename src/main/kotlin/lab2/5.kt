package lab2

fun main() {
    val firstNumber: Int = readln().toInt()
    val secondNumber: Int = readln().toInt()
    val thirdNumber: Int = readln().toInt()
    val numbers = listOf(firstNumber, secondNumber, thirdNumber)
    val distinctNumbers = numbers.distinct().sorted()
    if (distinctNumbers.size == 3) {
        println(distinctNumbers[1])
    } else {
        println("Ошибка")
    }
}