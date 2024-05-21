package lab7

import kotlinx.coroutines.*


suspend fun complexOperation(firstNumber: Int, secondNumber: Int): Long = coroutineScope {
    val iterations = 10000000000;
    var num: Long = 0;
    for (i in 0 until iterations) {
        num += firstNumber.toLong() * secondNumber * i * i;
    }
    num;
}
fun main(): Unit = runBlocking {
    println(complexOperation(12345678, 910111213))
}