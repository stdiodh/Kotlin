package programmers.Lv1

class `하샤드수` {
    fun solution(x: Int): Boolean {
        var sum = 0
        val arr = x.toString().toCharArray().map { it.code - 48 }
        for(i in arr){
            sum += i
        }

        if(x % sum == 0){
            return true
        } else {
            return false
        }
    }
}

fun main(){
    val n = 하샤드수()
    println(n.solution(12))
}