//package AandI.`4week`
//
//fun solution(s: String): String {
//    val countStack = ArrayDeque<Int>()
//    val stringStack = ArrayDeque<StringBuilder>()
//
//    var current = StringBuilder()
//    var num = 0
//
//    for (ch in s) {
//        when {
//            ch.isDigit() -> {
//                num = num * 10 + (ch - '0')
//            }
//
//            ch == '[' -> {
//                countStack.addLast(num)
//                stringStack.addLast(current)
//                current = StringBuilder()
//                num = 0
//            }
//
//            ch == ']' -> {
//                val repeatCount = countStack.removeLast()
//                val prev = stringStack.removeLast()
//
//                repeat(repeatCount) {
//                    prev.append(current)
//                }
//
//                current = prev
//            }
//
//            else -> {
//                current.append(ch)
//            }
//        }
//    }
//
//    return current.toString()
//}
//
//fun main() {
//    println(solution("100[a]2[bc]"))      // aaabcbc
//    println(solution("3[a2[c]]"))       // accaccacc
//    println(solution("2[abc]3[cd]ef"))  // abcabccdcdcdef
//}