package lambda

fun greeting(block: (String) -> Any, value: String){
    block(value)
}

fun greeting(value: String, block: (String) -> Any){
    block(value)
}

fun main() {
    greeting("hello world") { println(it) }
}