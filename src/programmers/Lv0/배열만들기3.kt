package programmers.Lv0

//class 배열만들기3 {
//    fun solution(arr: IntArray, intervals: Array<IntArray>): IntArray {
//        var answer: IntArray = arr
//        var slice = intervals[0]
//        var behind = intervals[1]
//
//        val intArray = mutableListOf<Int>()
//        for(i in slice[0].. slice[1]){
//            intArray.add(arr[i])
//        }
//
//        for(j in behind[0].. behind[1]){
//            intArray.add(arr[j])
//        }
//
//        return intArray.toIntArray()
//    }
//}

class 배열만들기3(){
    fun solution(arr: IntArray, intervals: Array<IntArray>): IntArray{
        return intervals.flatMap { (left, right) -> arr.slice(left..right) }.toIntArray()
    }
}

fun main(){
    val n = 배열만들기3()
    val arr = intArrayOf(1, 2, 3, 4, 5)
    val intervals = arrayOf(intArrayOf(1,3), intArrayOf(0,4))
    print(n.solution(arr, intervals).toList())
}