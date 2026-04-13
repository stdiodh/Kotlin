//package programmers.Lv1
//
//class 문자열내마음대로정렬하기 {
//    fun solution(strings: Array<String>, n: Int): Array<String> {
//        return strings
//            .sortedWith(compareBy<String> { it[n] }.thenBy { it })
//            .toTypedArray()
//    }
//}
//
//fun main() {
//    val strings = arrayOf("abce", "abcd", "cdx")
//    val n = 2
//    println(문자열내마음대로정렬하기().solution(strings, n).contentToString())
//}
