package lab1

fun main() {
    println("Введите имя")
    val name = readln()
    if (name.isEmpty() || !name.all { it.isLetter() }) {
        throw IllegalArgumentException("Имя должно состоять из букв")
    }
    println("Введите возраст")
    val age: Int = readln().toInt()
    println("Привет, $name! Тебе уже $age")
}