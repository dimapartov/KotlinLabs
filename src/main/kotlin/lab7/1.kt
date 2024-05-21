package lab7

import kotlinx.coroutines.*
import java.text.SimpleDateFormat
import java.util.Date

fun main(): Unit = runBlocking {
    launch {
        while (true) {
            println(SimpleDateFormat("HH:mm:ss").format(Date(System.currentTimeMillis())));
            delay(1000L);
        }
    }
}