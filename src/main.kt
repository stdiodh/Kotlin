//import java.io.StreamTokenizer
//
//fun main() = with(StreamTokenizer(System.`in`.bufferedReader())) {
//    fun readInt(): Int {
//        nextToken(); return nval.toInt()
//    }
//
//    fun readString(): String {
//        nextToken(); return sval
//    }
//
//    val aN = readInt(); val aM = readInt()
//    val matrix1 = Array(aN) { IntArray (aM) { readInt() } }
//
//    val bN = readInt(); val bM = readInt()
//    val matrix2 = Array(bN) { IntArray(bM) { readInt() } }
//
//    val malMatrix = Array(aN) { IntArray(bM) { 0} }
//
//
//
//    repeat(aN) { i ->
//        repeat(matrix2[0].size) { j ->
//            repeat(matrix1[0].size) { k ->
//                malMatrix[i][j] += matrix1[i][k] * matrix2[k][j]
//            }
//        }
//    }
//
//    malMatrix.forEach { println(it.toList().joinToString(" ")) }
//}

//fun main() {
//    val br = System.`in`.bufferedReader()
//    val num = br.readLine().toCharArray()
//
//    for(i in 0 .. num.size - 1) {
//        for(j in i until num.size) {
//            if(num[i] < num[j]) {
//                val temp = num[i]
//                num[i] = num[j]
//                num[j] = temp
//            }
//        }
//    }
//
//    print(num)
//}




//import java.io.StreamTokenizer
//
//fun main() = with(StreamTokenizer(System.`in`.bufferedReader())) {
//    fun readInt(): Int {
//        nextToken(); return nval.toInt()
//    }
//
//    fun readString(): String {
//        nextToken(); return sval
//    }
//
//    val n = readInt()
//    val intArr = IntArray(n) { readInt() }
//
//    for(i in 0 .. intArr.size - 1) {
//        var minIndex = i
//        for(j in i + 1 until intArr.size) {
//            if(intArr[j] < intArr[minIndex]) {
//                minIndex = j
//            }
//        }
//        val temp = intArr[minIndex]
//        intArr[minIndex] = intArr[i]
//        intArr[i] = temp
//    }
//
//    intArr.forEach { println(it) }
//}

//fun solution(path : String): String {
//    return when {
//        Regex("^/.*").matches(path) -> "UNIX_ABSOLUTE"
//        Regex("^[A-Z]:\\\\.*").matches(path) -> "WINDOWS_ABSOLUTE"
//        else -> "RELATIVE"
//    }
//}

//fun solution(fileName: String) : String {
//    var answer = ""
//    var splitExtension = fileName.split(".")
//    val splitCnt = splitExtension.size - 1
//    answer = if(splitCnt == 0) {
//        "NONE"
//    } else {
//        splitExtension[splitCnt]
//    }
//
//    return answer
//}

//fun main(){
//    print(solution(".gitignore"))
//fun main() {
//    val score = intArrayOf(10, 100, 20, 150, 1, 100, 200)
//    print(solution(3, score).contentToString())
//
//    val str : String = "str"
//    val n : Int = 0
//}
//
//
//
////}
//
//
//fun solution(k: Int, score: IntArray): IntArray {
//    val hall = mutableListOf<Int>()
//    val answer = mutableListOf<Int>()
//
//    for (s in score) {
//        hall.add(s)
//        hall.sortDescending()
//
//        if (hall.size > k) {
//            hall.removeAt(hall.lastIndex)
//        }
//
//        answer.add(hall.last())
//    }
//
//    return answer.toIntArray()
//}

//private var n = 1
//fun solution(list_N: IntArray, v: Int): Int {
//
//    var answer = 0;
//    for (i in 0..list_N.size-1){
//        if(list_N[i]==v){
//            answer++
//        }
//    }
//    return answer
//}


//
//fun main() {
//    val n: IntArray = intArrayOf(1, 4, 1, 2, 4, 2, 4, 2, 3, 4, 4)
//    val b = 2
//
//
//    val mutableList = mutableListOf<Int>(1,2,3,4,5)
//    val listOf = listOf<Int>(1,2,3,4,5)
//    val arr = IntArray(5) { 0 }
//
////    arr.add() //?
//    arr[5] = 4
//    listOf.add(1)
//    listOf[0] = 1
//    mutableList.add(1)
//    mutableList.remove(1)
//
//
//    arr.forEach { println("arr = $it") }
//    mutableList.forEach { println("list = $it") }
//}
//
//fun solution(names: Array<String>, yearning: IntArray, photos: Array<Array<String>>): IntArray {
//    val answer = mutableListOf<Int>()
//    val map = mutableMapOf<String, Int>()
//    for(idx in names.indices){
//        map[names[idx]] = yearning[idx]
//    }
//
//    for(idx in photos.indices) {
//        var tmp = 0
//        for(jdx in photos[idx].indices) {
//            val name = photos[idx][jdx]
//            if(map.contains(name)) {
//                tmp += map.getValue(name)
//            }
//        }
//        answer.add(tmp)
//    }
//
//    return answer.toIntArray()
//}
//
//fun main() {
//    val arrStr = arrayOf("may", "kein", "kain", "radi")
//    val arrInt = intArrayOf(5, 10, 1, 3)
//    val photoArr = arrayOf(arrayOf("may", "kein", "kain", "radi"), arrayOf("may", "kein", "brin", "deny"), arrayOf("kon", "kain", "may", "coni"))
//    println(solution(arrStr, arrInt, photoArr).contentToString())
//}


//import kotlin.math.sqrt
//
//fun solution(number: Int, limit: Int, power: Int): Int {
//    val divCnt = Array<Int>(number) { 0 }
//
//    for (i in 1..number) {
//        var cnt = 0
//
//        for (j in 1..sqrt(i.toDouble()).toInt()) {
//            if (i % j == 0) {
//                cnt += if (j * j == i) {
//                    1
//                } else {
//                    2
//                }
//            }
//        }
//
//        divCnt[i - 1] = cnt
//    }
//
//    for(i in divCnt.indices) {
//        if(divCnt[i] > limit) {
//            divCnt[i] = power
//        }
//    }
//
//    return divCnt.fold(0) { total, i -> total + i }
//}
//
//fun main() {
//    val number = 10
//    val limit = 3
//    val power = 2
//    println(solution(number, limit, power))
//}

fun solution(answers: IntArray): IntArray {
    val supo1 = intArrayOf(1, 2, 3, 4, 5)
    val supo2 = intArrayOf(2, 1, 2, 3, 2, 4, 2, 5)
    val supo3 = intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)

    val cnt = intArrayOf(0, 0, 0)

    for (i in answers.indices) {
        if (answers[i] == supo1[i % supo1.size]) cnt[0]++
        if (answers[i] == supo2[i % supo2.size]) cnt[1]++
        if (answers[i] == supo3[i % supo3.size]) cnt[2]++
    }

    val maxVal = cnt.maxOrNull()

    val result = mutableListOf<Int>()
    for (i in cnt.indices) {
        if (cnt[i] == maxVal) {
            result.add(i + 1)
        }
    }

    return result.toIntArray()
}

fun main() {

}