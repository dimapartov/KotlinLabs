package lab2

fun main() {
    println("Введите значение потерь:")
    val loss:Int = readln().toInt()
    println("Введите значение прибыли:")
    val income:Int = readln().toInt()
    val result = income - loss
    if (income > loss) {
        println("Ваша прибыль составила: $result")
    } else if (income < loss) {
        println("Ваши убытки составили: ${-result}")
    } else {
        println("Вы ушли в 0")
    }
}