package fastIO

fun main(){
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val n = br.readLine()
    bw.write(n)
    br.close()
    bw.close()
}