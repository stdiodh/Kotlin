package fastIO

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }
    fun nextString() : String { nextToken(); return sval }

    val n = nextInt()
    println(n)

    val str = nextString()
    println(str)
}