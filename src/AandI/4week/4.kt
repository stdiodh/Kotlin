package AandI.`4week`

//fun factorial(n: Long): Long {
//    return if (n <= 1) {
//        1
//    } else {
//        n * factorial(n - 1) // 자기 자신 호출
//    }
//}

fun main() {
    val arr = mutableListOf(
        Pair("a", 0),
        Pair("b", 1),
        Pair("c", 3)
    )

    print(arr.sortedWith(compareBy ({ it.first }, { it.second })))
}
