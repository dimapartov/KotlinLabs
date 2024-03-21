package lab1

fun main() {
    val inputNumber:Int = readln().toInt() //2642
    val years = inputNumber / 365
    val weeks = (inputNumber % 365) / 7
    val days = (inputNumber % 365) % 7
    println("Лет: $years, недель: $weeks, дней: $days")
}