package lab2

fun main() {
    val firstNumber = 2
    val secondNumber = 6
    println("У вас есть числа: $firstNumber и $secondNumber")
    println("1. Добавить")
    println("2. Отнять")
    println("0. Ничего")
    when (readln().toInt()) {
        1 -> println("Сложение: ${firstNumber + secondNumber}")
        2 -> println("Вычитание: ${firstNumber - secondNumber}")
        0 -> return
        else -> println("Выберите действие из списка")
    }
}