fun main(){
    var a : Int = 3
    var b : Int = if(a == 5) 8 else 3
    //b는 엘비스 연산자로 a의 값에 따라 값이 결정됨.
    println(b)


    var nubmer : Int? = 10
    println(number ?: "null인 값이였음.")
}