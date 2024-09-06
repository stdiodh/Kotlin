package lambda

fun main() {
    // 함수를 변수로 저장
    val apple = { fruit : String -> println("fruit : $fruit") }
    apple.invoke("apple")

    // 함수를 파라미터로 전달
    val bucket = listOf("apple", "banana", "strawberry", "watermelon").fold("tomato")
    { acc: String, next: String -> "$acc, $next"}.also { println(it) }
}