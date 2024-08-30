package function

fun main() {
    val a : List<Int> = listOf(1, 2, 3, 4, 5, 6)

    val b = a.find { it % 2 == 0}
    val c = a.findLast { it % 2 == 0 }
    println("find : $b findLast : $c")
}