fun main(){
    var isTrue : Boolean = false
    var a : Int = 3

// if문 ~ else문
//    if (isTrue){
//        println("참")
//    } else {
//        println("거짓")
//    }


// else if 문
//    if (a == 10) {
//        println(10)
//    } else if (a == 5){
//        println(5)
//    } else{
//        print("5와 10 둘다 아님")
//    }

    //삼항 연산자
    var i = 5
    val result = if (i > 10) true else false
    println(result)

// when 문 자바의 select문과 비슷
    when(a) {
        10 -> {
            println(10)
        }
        8 -> {
            println(8)
        }
        5 -> {
            println(5)
        }
        else -> {
            println("숫자가 없음")
        }

    }
}