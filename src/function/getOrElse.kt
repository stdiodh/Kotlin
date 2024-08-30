package function

fun main() {
    val a : List<Int> = listOf(1, 2, 3, 4, 5, 6)

    println(a.getOrElse(2) { 10 })
    println(a.getOrElse(10) { println("10번째 요소는 없습니다") })
}