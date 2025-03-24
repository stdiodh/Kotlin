package programmers.Lv0

class 배열의원소삭제하기 {
    fun solution(arr: IntArray, delete_list: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        return arr.filterNot { it in delete_list }.toIntArray()
    }
}


fun main(){
    val n = 배열의원소삭제하기()
    val arr = intArrayOf(293, 1000, 395, 678, 94)
    val delete_list = intArrayOf(94, 777, 104, 1000, 1, 12)
    println(n.solution(arr, delete_list).toList())
}