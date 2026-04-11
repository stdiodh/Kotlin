//package AandI.`3week`
//
//fun solution(text: String): List<Int> {
//    val answer = mutableListOf(0, 0, 0)
//    for(ch in text) {
//        when(ch) {
//            in 'A' .. 'Z' -> answer[0]++
//            in 'a' .. 'z' -> answer[1]++
//            in '0'..'9' -> answer[2]++
//        }
//    }
//
//    return answer
//}
//
//fun main() {
//    print(solution("A1bB!9"))
//}