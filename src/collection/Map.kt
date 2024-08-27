package collection

fun main() {
    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)

    println("모든 키(K)들 : ${numbersMap.keys}")
    println("모든 값(V)들 : ${numbersMap.values}")
    if ("key2" in numbersMap) println("Key2 의 값 Value 는? : ${numbersMap["key2"]}")
    if (1 in numbersMap.values) println("값 1은 map 안에 있습니다!")
    if (numbersMap.containsValue(1)) println("값 1은 map 안에 있습니다!")
}