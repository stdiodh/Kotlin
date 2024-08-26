package basic

fun main() {
    sayHello()
    println(add(3, 5))
    println(div(3, 5))
    println(add(3, 5, 1))
}

//main 함수 밖에서 선언된 함수는 toplevel함수로
//어느 파일에서도 사용가능한 함수이다.
fun sayHello() : Unit {
    println("Hello")
}

//fun 함수이름 (매개변수 이름1 : 타입1, 매개변수 이름2 : 타입2) : 리턴변수타입 {}
fun add (a : Int, b : Int) : Int {
    return a + b
}

//함수가 한줄일 때는 =으로 축약가능함
fun div (a : Int, b : Int) : Int = a-b

//c가 없지만 오버로드를 통해 c를 디폴트로 만들어 사용할 수도 있음
fun add (a: Int, b: Int, c : Int = 1) = a+b+c