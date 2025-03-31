package programmers.Lv1

class `평균구하기` {
    fun solution(arr: IntArray): Double {
        val answer = arr.sumOf { it }.toDouble()
        return answer / arr.size
    }
}

fun main(){
    val n = 평균구하기()
    println(n.solution(intArrayOf(1,2,3,4)))
}