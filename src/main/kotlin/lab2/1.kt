package lab2

fun main() {
    val number = 20 % 17
    if (number > 0) {
        println("Получилось значение большее чем ноль!")
    }
    else if (number < 0) {
        println("Получилось значение меньшее чем ноль!")
    }
    else {
        println("Остатка от деления нет")
    }
}