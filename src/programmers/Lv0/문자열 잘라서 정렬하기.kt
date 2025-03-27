package programmers.Lv0

class `문자열잘라서정렬하기` {
    fun solution(myString: String): List<String> {
        return myString.split("x").filter { it.isNotEmpty() }.sorted()
    }
}

fun main() {
    val n = 문자열잘라서정렬하기()
    val myString = "dxccxbbbxaaaa"
    println(n.solution(myString).toList())
}