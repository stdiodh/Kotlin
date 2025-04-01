package programmers.Lv1

class `음양더하기` {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var sum: Int = 0
        for (j in signs.indices) {
            if (signs[j]) {
                sum += absolutes[j]
            } else {
                sum -= absolutes[j]
            }
        }
        return sum
    }
}

fun main(){
    val n = 음양더하기()
    println(n.solution(intArrayOf(4, 7, 12), booleanArrayOf(true, false, true)))
}