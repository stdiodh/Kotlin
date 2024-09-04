package lambda

fun main() {
    val apple = { fruit : String -> println("fruit : $fruit") }

    apple.invoke("apple")

}