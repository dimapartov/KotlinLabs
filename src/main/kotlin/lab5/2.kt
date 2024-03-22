package lab5

fun main() {
    println(1.printYearEnding())
    println(22.printYearEnding())
    println(30.printYearEnding())
    println(readln().toInt().printYearEnding())
}

fun Int.printYearEnding(): String {
    return when {
        this % 10 == 1 && this % 100 != 11 -> "$this год. Остаток от деления на 10: ${this % 10}. На 100: ${this % 100}"
        this % 10 in 2..4 && this % 100 !in 12..14 -> "$this года"
        else -> "$this лет"
    }
}