package lab3

fun main() {
    println("Введите число:")
    val inputNumber = readln()
    var evenNumbersCount = 0
    var oddNumbersCount = 0
    if (inputNumber.all {it.isDigit()}) {
        evenNumbersCount =  inputNumber.count { it.toInt() % 2 == 0}
        oddNumbersCount =  inputNumber.count { it.code % 2 != 0}
    }
    println("Количество четных цифр: $evenNumbersCount")
    println("Количество нечетных цифр: $oddNumbersCount")
}