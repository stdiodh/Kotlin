package programmers.Lv1

class 콜라문제 {
    fun solution(a: Int, b: Int, n: Int): Int {
        var bottles = n
        var answer = 0

        while (bottles >= a) {
            val changed = bottles / a * b
            val remain = bottles % a

            answer += changed
            bottles = changed + remain
        }

        return answer
    }
}

fun main() {
    val n = 콜라문제()
    println(n.solution(2, 1, 20))
}
