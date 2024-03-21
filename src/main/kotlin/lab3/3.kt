package lab3

fun main() {
    println("Введите число:")
    val inputNumber = readln().toInt()
    val result = mutableListOf<Int>()
    for (i in 1..inputNumber) {
        if (inputNumber % i == 0) {
            result.add(i)
        }
    }
    println(result.joinToString())
}