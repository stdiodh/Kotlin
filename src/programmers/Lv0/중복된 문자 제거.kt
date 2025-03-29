package programmers.Lv0

class `중복된문자제거` {
    fun solution(my_string: String): String {
        return my_string.toCharArray().distinct().joinToString("")
    }
}

fun main(){
    val n = 중복된문자제거()
    println(n.solution("people"))
}