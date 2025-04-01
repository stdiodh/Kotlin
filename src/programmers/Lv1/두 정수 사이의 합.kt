package programmers.Lv1

class `두정수사이의합` {
    fun solution(a: Int, b: Int): Long {
        var answer: Long = 0
        if(a <= b){
            for(i in a .. b){
                answer += i.toLong()
            }
        } else {
            for(i in b .. a){
                answer += i.toLong()
            }
        }

        return answer
    }
}

fun main(){
    val n = 두정수사이의합()
    println(n.solution(5,3))
}