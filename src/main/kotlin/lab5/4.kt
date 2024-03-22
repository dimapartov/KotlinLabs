package lab5

fun main() {
    println(countWords("Раз    ,   два,,, три ?четрые ???пять; .. ,!  .;;.; шесть ;;;семь"))
}

fun countWords(stringInput:String):Int {
    val words = stringInput.split(*arrayOf(" ", ",", ";", ".", "!", "?")).filter { it.isNotEmpty() }
//    println(words)
//    words = words.filter { it.isNotEmpty() }
//    println(words)
    return words.size
}