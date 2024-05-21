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
                val fileName = url.substringAfterLast("/")
                try {
                    downloadAndSaveImage1(client, url, if (fileName.endsWith(".jpg")) fileName else "$fileName.jpg")
                } catch (e: Exception) {
                    println("Failed to download and save image: ${e.message}")
                }
            }
        }.joinAll()
    }
    client.close()
}

suspend fun downloadAndSaveImage1(client: io.ktor.client.HttpClient, url: String, fileName: String) {
    val bytes: ByteArray = client.get(url).body<ByteArray>()
    val filePath = "src/main/kotlin/lab8/images/$fileName"
    try {
        File(filePath).writeBytes(bytes)
        println("${coroutineContext[CoroutineName]} has saved file as $filePath")
    } catch (e: Exception) {
        println("Failed to write file: ${e.message}")
    }
}

val urls = listOf(
    "https://dummyimage.com/100x100/000/fff&text=1",
    "https://dummyimage.com/100x100/111/fff&text=2",
    "https://dummyimage.com/100x100/222/fff&text=3",
    "https://dummyimage.com/100x100/333/fff&text=4",
    "https://dummyimage.com/100x100/444/fff&text=5",
    "https://dummyimage.com/100x100/555/fff&text=6",
    "https://dummyimage.com/100x100/666/fff&text=7",
    "https://dummyimage.com/100x100/777/fff&text=8",
    "https://dummyimage.com/100x100/888/fff&text=9",
    "https://dummyimage.com/100x100/999/fff&text=10",
    "https://dummyimage.com/100x100/aaa/fff&text=11",
    "https://dummyimage.com/100x100/bbb/fff&text=12",
    "https://dummyimage.com/100x100/ccc/fff&text=13",
    "https://dummyimage.com/100x100/ddd/fff&text=14",
    "https://dummyimage.com/100x100/eee/fff&text=15",
    "https://dummyimage.com/100x100/fff/000&text=16",
    "https://dummyimage.com/100x100/111/eee&text=17",
    "https://dummyimage.com/100x100/222/ddd&text=18",
    "https://dummyimage.com/100x100/333/ccc&text=19",
    "https://dummyimage.com/100x100/444/bbb&text=20",
    "https://dummyimage.com/100x100/555/aaa&text=21",
    "https://dummyimage.com/100x100/666/999&text=22",
    "https://dummyimage.com/100x100/777/888&text=23",
    "https://dummyimage.com/100x100/888/777&text=24",
    "https://dummyimage.com/100x100/999/666&text=25",
    "https://dummyimage.com/100x100/aaa/555&text=26",
    "https://dummyimage.com/100x100/bbb/444&text=27",
    "https://dummyimage.com/100x100/ccc/333&text=28",
    "https://dummyimage.com/100x100/ddd/222&text=29",
    "https://dummyimage.com/100x100/eee/111&text=30",
    "https://dummyimage.com/100x100/fff/000&text=31",
    "https://dummyimage.com/100x100/111/fff&text=32",
    "https://dummyimage.com/100x100/222/eee&text=33",
    "https://dummyimage.com/100x100/333/ddd&text=34",
    "https://dummyimage.com/100x100/444/ccc&text=35",
    "https://dummyimage.com/100x100/555/bbb&text=36",
    "https://dummyimage.com/100x100/666/aaa&text=37",
    "https://dummyimage.com/100x100/777/999&text=38",
    "https://dummyimage.com/100x100/888/888&text=39",
    "https://dummyimage.com/100x100/999/777&text=40",
    "https://dummyimage.com/100x100/aaa/666&text=41",
    "https://dummyimage.com/100x100/bbb/555&text=42",
    "https://dummyimage.com/100x100/ccc/444&text=43",
    "https://dummyimage.com/100x100/ddd/333&text=44",
    "https://dummyimage.com/100x100/eee/222&text=45",
    "https://dummyimage.com/100x100/fff/111&text=46",
    "https://dummyimage.com/100x100/111/000&text=47",
    "https://dummyimage.com/100x100/222/fff&text=48",
    "https://dummyimage.com/100x100/333/eee&text=49",
    "https://dummyimage.com/100x100/444/ddd&text=50"
)