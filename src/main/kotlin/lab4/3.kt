package lab4

fun main() {
    val list = mutableListOf(24, -63, 67, -12, 88, 94, -28, 82, 0, 53)
    val min = list.min()
    val max = list.max()
    println("Минимум: $min")
    println("Максимум: $max")
}