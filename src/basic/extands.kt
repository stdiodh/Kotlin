package basic

fun main(){
    val dog: Animal = Dog()
    val cat = Cat()

    if (dog is Dog){
        println("멍멍이")
    }
}

//코틀린은 기본적으로 닫혀있음
//상속을 받으려면 open을 해야함

abstract class Animal {
    //또한 오버라이드를 위해 open이라는 키워드가 필요
    open fun move(){
        println("이동")
    }
}


class Dog : Animal(){
    override fun move(){
        println("껑충")
    }
}

class Cat : Animal(){
    override fun move(){
        println("살금")
    }
}