package function

fun main() {
    val a: List<Int> = listOf(1, 3, 5)

    println("Fold : ${a.fold(0) { acc, i ->
        acc + i * 2
    }}")

    println("Reduce : ${a.reduce { acc, i ->
        acc + i * 2
    }}")
}