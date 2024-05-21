package lab6

fun main() {
    val numbersList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    val filteredNumbersList = numbersList.filter { it % 2 != 0 };
    println(filteredNumbersList);
}
fun <T> List<T>.filter(condition: (T) -> Boolean): List<T> {
    val resultList = mutableListOf<T>();
    for (listItem in this) {
        if (condition(listItem) == true) {
            resultList.add(listItem);
        }
    }
    return resultList;
}