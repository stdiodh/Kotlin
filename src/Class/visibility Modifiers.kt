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

//annotation class MyAnnotation
//
//@MyAnnotation
//fun main(){
//
//}

class UserInfo {
    var name: String = ""
        set(value) {
            if (value == "김연아")
                field = "${value}는 천재입니다"
            else field=value
        }

    var address: String = ""
        set(value) {
            if (value == "한국") {
                field = "대한민국"
            } else field = value
        }
        get() {
            // 반드시 return 문으로 작성해야 합니다.
            return "${field}에 거주하고 있습니다"
        }

    constructor(name: String, address: String) {
        this.name = name
        this.address = address
    }
}

fun main() {
    val user1 = UserInfo("김연아", "한국")
    println(user1.name)
    //김연아는 천재입니다
    println(user1.address)
    //대한민국에 거주하고 있습니다

    val user2 = UserInfo("홍길동", "서울")
    println(user2.name)
    //홍길동
    println(user2.address)
    //서울에 거주하고 있습니다
}
