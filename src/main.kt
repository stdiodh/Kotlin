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
//}

