fun main() {
    sayHello()
    println(add(3, 5))
    println(div(3, 5))
}

fun sayHello() : Unit{
    println("Hello")
}

//fun 함수이름 (매개변수 이름1 : 타입1, 매개변수 이름2 : 타입2) : 리턴변수타입 {}
fun add (a : Int, b : Int) : Int {
    return a + b
}

fun div (a : Int, b : Int) : Int = a-b

//함수가 한줄일 때는 =으로 축약가능함
