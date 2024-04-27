fun main() {
    sayHello()
    println(add(3, 5))
    println(div(3, 5))
}

fun sayHello() : Unit{
    println("Hello")
}

fun add (a : Int, b : Int) : Int {
    return a + b
}

fun div (a : Int, b : Int) : Int = a-b
//=으로 한줄로 축약가능
