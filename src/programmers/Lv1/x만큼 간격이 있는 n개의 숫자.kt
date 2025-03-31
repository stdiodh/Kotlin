package programmers.Lv1

class `x만큼간격이있는n개의숫자` {
    fun solution(x: Int, n: Int): LongArray {
        val answer = LongArray(n){ 0 }
        for(i in 0 until n){
            answer[i] = (x.toLong() * (i+1))
        }
        return answer
    }
}

fun main(){
    val n = x만큼간격이있는n개의숫자()
    println(n.solution(2, 5).toList())
}