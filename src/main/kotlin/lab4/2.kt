package lab4

fun main() {
    val list = mutableListOf<Int>()
    list.addAll(listOf(8, 21, 5, 90, 11, 0))
    println(list)
    list.add(0, 90)
    println(list)
    list.removeAt(4)
    println(list)
    list.add(-35)
    println(list)
}