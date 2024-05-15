/*
컴파일 타임 상수
컴파일 이후 값이 절대 변경되지 않는 상수
성능상 우위를 얻을 수 있음
 */
const val num : Int = 10


fun main() {
    /*
    변수의 타입은 대문자로
    변수는 var, 상수는 val로
    변수는 값을 변경가능하고 상수는 한번 선언하면 값을 절대 변경할 수 없음
    즉 재대입 불가
    */

    var num1 : Int = 20
    println(num1)

    num1 = 10
    println(num1)

    val num2 : Int = 10
    println(num2)

    // num2 = 20 불가
}