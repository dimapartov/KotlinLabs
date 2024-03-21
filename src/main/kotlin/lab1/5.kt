package lab1

fun main() {
    val inputNumber: Int = readln().toInt() //23
    val result = "$inputNumber${inputNumber * 2}"
    println(result)
}