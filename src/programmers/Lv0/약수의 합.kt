package programmers.Lv0

class `약수의합` {
    fun solution(n: Int): Int {
        var answer = 0
        for(i in 1 .. n){
            if(n % i == 0){
                answer += i
            }
        }

        return answer
    }
}