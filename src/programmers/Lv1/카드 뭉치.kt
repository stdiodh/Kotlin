//package programmers.Lv1
//
//class `카드뭉치` {
//    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
//        var i = 0
//        var j = 0
//
//        for (word in goal) {
//            when {
//                i < cards1.size && cards1[i] == word -> i++
//                j < cards2.size && cards2[j] == word -> j++
//                else -> return "No"
//            }
//        }
//
//        return "Yes"
//    }
//}
//
//fun main() {
//    val cards1 = arrayOf("i", "water", "drink")
//    val cards2 = arrayOf("want", "to")
//    val goal = arrayOf("i", "want", "to", "drink", "water")
//    println(카드뭉치().solution(cards1, cards2, goal))
//}