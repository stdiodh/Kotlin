package programmers.Lv0

class `구로나눈나머지` {
    fun solution(number: String): Int {
        return number.sumOf { it.toString().toInt() } % 9
    }
}

fun main(){
    val n = 구로나눈나머지()
    val num = "78720646226947352489"
    print(n.solution(num))
}