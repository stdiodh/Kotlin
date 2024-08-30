package function

fun main() {
    val a : List<String> = listOf("abc", "def", "hij")

    a.forEach{ println(it) }
    a.forEachIndexed { index, c ->  println("$index : $c") }

}