package lab4

fun main() {
    val firstNumber = 5
    val secondNumber = 8
    val start = minOf(firstNumber, secondNumber)
    val end = maxOf(firstNumber, secondNumber)
    val list = (start..end).toList()
    println(list.joinToString(separator = ", "))
}
//