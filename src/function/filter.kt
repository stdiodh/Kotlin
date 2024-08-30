package function

fun main(){
    val a : List<Int> = listOf(1, 2, 3, 4, 5, 6)
    val b = a.filter { it % 2 == 0 }
    println(b)
}