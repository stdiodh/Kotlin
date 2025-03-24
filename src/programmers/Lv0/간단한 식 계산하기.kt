class 간단한식계산하기 {
    fun solution(binomial: String): Int {
        val parts = binomial.split(" ") // "a op b" 형태이므로 공백 기준으로 나눔
        val a = parts[0].toInt()
        val op = parts[1]
        val b = parts[2].toInt()

        return when (op) {
            "+" -> a + b
            "-" -> a - b
            "*" -> a * b
            else -> throw IllegalArgumentException("지원하지 않는 연산자입니다.")
        }
    }
}

fun main() {
    val n = 간단한식계산하기()
    println(n.solution("43 + 12"))  // 55
    println(n.solution("10 - 3"))   // 7
    println(n.solution("5 * 6"))    // 30
}
