package CS.timeComplexity

fun fibonacci(n : Int): Int {
    if (n <= 1) {
        return 1
    }
    return fibonacci(n - 1) + fibonacci(n - 2)
}

fun main() {
    println(fibonacci(10))
}