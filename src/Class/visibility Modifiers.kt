package Class

open class Animal {
    protected fun sound() { println("울음 소리!") }
}

//상속받은 클래스 내부에서는 사용 가능
class Dog : Animal() {
    fun walwal() {
        //사용 가능
        sound()
    }
}
//
//class Cat {
//    fun miaumiau() {
//        //사용 불가
//        sound()
//    }
//}

internal fun doSomething() {}

//fun main(){
//    //같은 모듈 내에서 사용 가능
//    doSomething()
//}

sealed class Result
class Success(val data: String) : Result()
class Error(val message: String) : Result()

class Outer {
    val outerName = "Outer"

    inner class Inner {
        fun print() = println(outerName)
    }
}

//fun main(){
//    val n = Outer().Inner().print() //Outer
//}

enum class Direction(val desc: String) {
    NORTH("북"), SOUTH("남"), EAST("동"), WEST("서")
}

annotation class MyAnnotation

@MyAnnotation
fun main(){

}