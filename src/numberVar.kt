import kotlin.reflect.typeOf

fun main (){
    var number1 : Int = 20
    var number2 : Double = 2.0
    var number3 : Long = 100

    if (number1 is Int) {
        println("number1 is Int")
    } else {
        println("number2 is not Int")
    }
}