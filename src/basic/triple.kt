package basic

fun main(){
    val a = Triple(2, "x", listOf(null))
    println(a.first) // 2
    println(a.second) // x
    println(a.third) // [null]

    val b = a.copy(1, "a", listOf(null))
    println(b.first) // 1
    println(b.second) // a
    println(b.third) // [null]
}