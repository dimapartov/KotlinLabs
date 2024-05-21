package lab6

fun main() {
    val calculateMultiplication = chooseAction('*');
    val calculateSummation = chooseAction('+');
    println(calculateMultiplication(10, 5));
    println(calculateSummation(9, 1));
}
fun chooseAction(action: Char): (Int, Int) -> Int {
    return when (action) {
        '+' -> { a, b -> a + b }
        '-' -> { a, b -> a - b }
        '*' -> { a, b -> a * b }
        '/' -> { a, b -> a / b }
        else -> throw Exception("Please provide correct action!");
    }
}