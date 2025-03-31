package programmers.Lv1

class `자연수뒤집어배열로만들기` {
    fun solution(n: Long): List<Int> {
        return n.toString().reversed().toCharArray().map { it.code - 48 }
    }
}

fun main(){
    val n = 자연수뒤집어배열로만들기()
    println(n.solution(12345))
}