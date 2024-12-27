package fastIO

fun main(){
    val n = readLine()
    println(n)

    val (x,y) = readln().split(" ").map { it.toInt() }
    println("$x $y")
}