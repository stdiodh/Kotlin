package programmers.Lv1

class `없는숫자더하기` {
    fun solution(numbers: IntArray): Int {
        val arr1 = numbers.sortedArray()
        val arr2 = BooleanArray(10) { false }
        var sum = 0
        for(i in 0 until arr1.size){
            arr2[arr1[i]] = true
        }

        for(x in arr2.indices){
            if(arr2[x]){
                continue
            } else {
                sum += x
            }
        }
        return sum
    }

//    모범답
//    class Solution {
//        fun solution(numbers: IntArray): Int = (0..9).filterNot(numbers::contains).sum()
//    }
}



fun main(){
    val n = 없는숫자더하기()
    println(n.solution(intArrayOf(1,2,3,4,6,7,8,0)))
}