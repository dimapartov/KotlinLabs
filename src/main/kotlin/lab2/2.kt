package lab2

fun main() {
    val age:Int = readln().toInt()
    when {
        age > 18 -> println("Вам уже все можно")
        age == 18 -> println("Ура, Вам 18 лет!")
        else -> println("Вы еще слишком молоды")
    }
}