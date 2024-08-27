package scope

//import kotlin.random.Random
//
//fun writeToLog(message: String) {
//    println("INFO: $message")
//}
//
//fun main() {
//    fun getRandomInt(): Int {
//        return Random.nextInt(100).also {
//            writeToLog("getRandomInt() generated value $it")
//        }
//    }
//
//    val i = getRandomInt()
//    println(i)
//}

import kotlin.random.Random

fun writeToLog(message: String) {
    println("INFO: $message")
}

fun main() {
    fun getRandomInt(): Int {
        return Random.nextInt(100).also { value ->
            writeToLog("getRandomInt() generated value $value")
        }
    }

    val i = getRandomInt()
    println(i)
}