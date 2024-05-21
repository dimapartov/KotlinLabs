package lab8

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import kotlinx.coroutines.*
import java.io.File
import kotlin.coroutines.coroutineContext


suspend fun main() {
    val client = HttpClient(CIO)

    withContext(Dispatchers.IO) {
        urls.mapIndexed { index, url ->
            launch(CoroutineName("downloader-$index")) {
                val fileName = "file${index + 1}.jpg"
                try {
                    downloadAndSaveImage2(client, url, fileName)
                } catch (e: Exception) {
                    println("Failed to download and save image: ${e.message}")
                }
            }
        }.joinAll()
    }
    client.close()
}

suspend fun downloadAndSaveImage2(client: HttpClient, url: String, fileName: String) {
    val bytes: ByteArray = client.get(url).body<ByteArray>()
    val filePath = "src/main/kotlin/lab8/images/$fileName"
    try {
        File(filePath).writeBytes(bytes)
        println("${coroutineContext[CoroutineName]} has saved file as $filePath")
    } catch (e: Exception) {
        println("Failed to write file: ${e.message}")
    }
}