package lab7

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

suspend fun executeWithTimeout(block: suspend () -> Unit) {
    try {
        withTimeout(1000L) {
            block();
        }
    } catch (e: TimeoutCancellationException) {
        println("Too long body execution");
    }
}

fun main():Unit = runBlocking {
    val time1 = measureTimeMillis {
        executeWithTimeout {
            delay(500L);
            println("Hello, world!");
        }
    }
    println(time1);

    val time2 = measureTimeMillis {
        executeWithTimeout {
            delay(1500L)
            println("Hello, world!");
        }
    }
    println(time2);
}