package lab3

fun main() {
    val correctNumberToGuess = (1..9).random()
    var userInput = 0
    while (userInput != correctNumberToGuess) {
        userInput = readln().toInt()
        if (userInput != correctNumberToGuess) {
            println("Не угадали! Попробуйте еще раз")
        }
    }
    println("Вы угадали число! Урааа!")
}