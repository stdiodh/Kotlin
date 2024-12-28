package fastIO

/* 1. readln
fun main() {
    val (a, b) = readln().split(" ").map { it.toInt() }
    println(a+b)
}
 */

/* 2. scanner
import java.util.Scanner

fun main(){
    val sc = Scanner(System.`in`)
    val (a, b) = sc.nextLine().split(" ").map { it.toInt() }
    print(a+b)
}
 */

/* 3. bufferedReader
fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val (a, b) = br.readLine().split(" ").map { it.toInt() }

    bw.write("${a + b}\n")
    br.close()
    bw.close()
}
 */

/* 4. StreamTokenizer + bufferedReader
import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }

    val a = nextInt(); val b = nextInt()
    print(a+b)
}
*/