package programmers.Lv1

class `정수내림차순으로배치하기` {
    fun solution(n: Long): Long {
        return n.toString().toCharArray().sortedArrayDescending().joinToString("").toLong()
    }
}