package programmers.Lv0

class `자릿수더하기` {
    fun solution(n: Int): Int {
        val num = n.toString().toCharArray().map { it.code - 48 }
        num.forEach{ println(it) }
        var ans = 0
        for(i in num){
            ans += i
        }

        return ans
    }
}

fun main() {
    val n = 자릿수더하기()
    println(n.solution(123))
}