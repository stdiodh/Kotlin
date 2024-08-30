package function

fun main() {
    val a = listOf(2, 3, 1)
    println( a.sorted())
    println( a.sortedDescending())

    val numbersMap = mapOf("key1" to 2, "key2" to 3, "key3" to 1)
    println(numbersMap.toSortedMap())
}