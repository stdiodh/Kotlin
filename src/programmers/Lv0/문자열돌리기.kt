package programmers.Lv0

fun main(args: Array<String>) {
    val br = System.`in`.bufferedReader()
    val s1 = br.readLine()!!

    val sb = StringBuilder()
    for(i in s1.indices){
        sb.appendLine(s1[i])
    }
    print(sb)
}