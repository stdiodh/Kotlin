package programmers.Lv0

private fun pow(num: Int, i: Int): Int {
    var ans = num
    for(i in 1 until i){
        ans *= num
    }
    return ans
}

class 주사위게임2 {
    fun solution(a: Int, b: Int, c: Int): Int {
        var answer: Int = 0
        if(a == b && b == c){
            answer += (a+b+c) * (pow(a, 2) + pow(b, 2) + pow(c, 2)) * (pow(a, 3) + pow(b, 3) + pow(c, 3))
        } else if (a == b || b == c || c == a){
            answer += (a+b+c) * (pow(a, 2) + pow(b, 2) + pow(c, 2))
        } else {
            answer += a+b+c
        }
        return answer
    }
}

fun main(){
    val n = 주사위게임2()
    val a = n.solution(5, 3, 3)
    print(a.toString())
}