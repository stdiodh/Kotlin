package basic

fun main() {
//    mapData는 변수를 리스트화한 것
//    mapOf는 리스트의 변수가 값이 변경이 안됨.

//    var myMap = mapOf(
//        "name" to "빵빵이",
//        "age" to 24,
//        "jab" to "백수"
//    )
//
//    println(myMap)
//    println(myMap["name"])

//  mutableMapOf는 리스트안 변수를 변경가능
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

