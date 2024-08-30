package function

fun main() {
    val a : List<Int> = listOf(1, 2, 3)
    val b = a.map { it * 10 }
    println(b)
    println(a.map { it * 10 })
}