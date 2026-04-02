package AandI.`2week`

import kotlin.text.toBigInteger

fun solution(a: String, b: String): String {
    return if (a.toBigInteger() >= b.toBigInteger()) a else b
}