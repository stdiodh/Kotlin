package programmers.Lv1

class 부족한금액계산하기 {
    fun solution(price: Int, money: Int, count: Int): Long {
        var total = 0L

        for (i in 1..count) {
            total += price.toLong() * i
        }

        val result = total - money

        return if (result > 0) {
            result
        } else {
            0
        }
    }
}

fun main() {
    val n = 부족한금액계산하기()
    println(n.solution(3, 20, 4))
}
