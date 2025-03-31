package programmers.Lv1

class `짝수와홀수` {
    fun solution(num: Int): String {
        var answer : Boolean? = num % 2 == 0
        if(answer == true){
            return "Even"
        } else {
            return "Odd"
        }
    }
}