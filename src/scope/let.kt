package scope

fun main() {
//    val numbers = mutableListOf("one", "two", "three", "four", "five")
//    val resultList = numbers.map { it.length }.filter { it > 3 }
//    println(resultList)
//
//    val numbers = mutableListOf("one", "two", "three", "four", "five")
//    numbers.map { it.length }.filter { it > 3 }.let(::println)

//    val str: String? = "Hello"
//    val length = str?.let {
//        println("let()에 의해 호출됨 $it")
//        it.length
//    }
//
    val numbers = listOf("one", "two", "three", "four")
    val modifiedFirstItem = numbers.first().let { firstItem ->
        println("The first item of the list is '$firstItem'")
        if (firstItem.length >= 5) firstItem else "!" + firstItem + "!"
    }.uppercase()
    println("First item after modifications: '$modifiedFirstItem'")
}