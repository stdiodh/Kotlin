package programmers.Lv1

class `나누어떨어지는숫자배열` {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var arr1 = arr.filter { it % divisor == 0 }.toIntArray().sortedArray()
        if(arr1.isEmpty()){
            arr1[0] = -1
        }
        return arr1
    }
}

fun main(){
    val n = 나누어떨어지는숫자배열()
    println(n.solution(intArrayOf(5,9,7,10), 5))
}