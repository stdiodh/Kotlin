package function

fun main() {
    val a : List<Int> = listOf(1, 2, 3)

    val flatA = a.flatMap { listOf( it * 3 ) }
    println(flatA)

    val flatList = a.flatMap { listOf(it * 3, it * 4) }
    println(flatList)
}