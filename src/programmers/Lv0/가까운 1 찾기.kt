package programmers.Lv0

class `가까운1찾기` {
    fun solution(arr: IntArray, idx: Int): Int {
        var answer: Int = 0

        for(i in idx until arr.size){
            if(arr[i] == 1){
                answer = i
                break
            } else {
                answer = -1
            }
        }

        return answer
    }
}

fun main(){
    val n = 가까운1찾기()
    val arr = intArrayOf(0, 0, 0, 1)
    val idx = 1
    print(n.solution(arr, idx))
}