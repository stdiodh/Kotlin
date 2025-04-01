package programmers.Lv1
import kotlin.math.sqrt

class `정수제곱근판별` {
    fun solution(n: Long): Long {
        var answer = sqrt(n.toDouble())
        if(answer % 1 == 0.toDouble()){
            return (answer.toLong() + 1) * (answer.toLong() +1)
        } else {
            return -1
        }
    }
}

fun main() {
    val n = 정수제곱근판별()
    println(n.solution(3))
    println(sqrt(121.0))
}