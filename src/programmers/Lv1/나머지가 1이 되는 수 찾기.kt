package programmers.Lv1

class `나머지가1이되는수찾기` {
    fun solution(n: Int): Int {
        var answer: Int = 0
        for (i in 1 until n) {
            if (n % i == 1) {
                answer = i
                break
            }
        }
        return answer
    }
}


//class Solution {
//    fun solution(n: Int) = (1..n).first { n % it == 1 }
//}

fun main(){
    val n = 나머지가1이되는수찾기()
    println(n.solution(10))
}

