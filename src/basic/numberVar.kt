package basic

fun main (){
    var number1 : Int = 20
    var number2 : Int = 10
    var number3 : Double = 2.0
    var number4 : Long = 100

    //max 함수를 불러와서 비교도 해줌
    println(kotlin.math.max(number1, number2))
    //min 함수도 있음
    println(kotlin.math.min(number1, number2))


    if (number1 is Int) {
        println("number1 is Int")
    } else {
        println("number2 is not Int")
    }
}