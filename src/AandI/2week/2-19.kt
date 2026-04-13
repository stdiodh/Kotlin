package AandI.`2week`

import java.math.BigDecimal

fun solution(numStr: String): String {
    return if (numStr.toBigDecimal() >= BigDecimal.ZERO) {
        "NON_NEGATIVE"
    } else {
        "NEGATIVE"
    }
}

fun main() {
    println(solution("-1.0E30"))
}