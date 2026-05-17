package programmers.Lv1

class 약수의개수와덧셈 {
    fun solution(left: Int, right: Int): Int {
        var answer = 0

        for (number in left..right) {
            if (countDivisors(number) % 2 == 0) {
                answer += number
            } else {
                answer -= number
            }
        }

        return answer
    }

    private fun countDivisors(number: Int): Int {
        var count = 0

        for (i in 1..number) {
            if (number % i == 0) {
                count++
            }
        }

        return count
    }
}

fun main() {
    val n = 약수의개수와덧셈()
    println(n.solution(13, 17))
}
