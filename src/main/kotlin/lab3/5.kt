package lab3

fun main() {
    var sum = 0
    for (i in 1..100) {
        if (i % 4 == 0) {
            println(i)
            sum += i
        }
    }
    println(sum)
}