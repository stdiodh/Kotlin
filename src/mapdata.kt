fun main() {
//    var myMap = mapOf(
//        "name" to "빵빵이",
//        "age" to 24,
//        "jab" to "백수"
//    )
//
//    println(myMap)
//    println(myMap["name"])

    var myMap = mutableMapOf(
        "name" to "빵빵이",
        "age" to 24,
        "jab" to "백수"
    )
    println(myMap)
    println(myMap["name"])
    myMap["name"] = "옥지"
    myMap["age"] = 23
    println(myMap)
}

