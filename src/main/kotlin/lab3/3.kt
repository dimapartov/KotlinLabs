package lab3

fun main() {
    println("Введите число:")
    val inputNumber = readln().toInt()
    val result = mutableListOf<Int>()
    result.add(1)
    for (i in 2..<inputNumber) {
        if (inputNumber % i == 0) {
            result.add(i)
        }
    }
    result.add(inputNumber)
    println(result.joinToString())
}
/////