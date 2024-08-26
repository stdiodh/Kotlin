package basic

fun main(){
//  swift의 옵셔널 변수와 비슷함
//  값을 가질수도 안 가질수도 있는 타입
    var age : Int? = null
    var sum : Int = 0

    var name: String? = null
    name = "춘식"
    var name2: String = ""

    //?를 붙인 순간 타입을 달라짐 널 체크를 하고 넣음
//    if (name != null) {
//        name2 = name
//    }

    //위의 조건문과 동일하며 if문 대신 간단하게 사용가능
    name?.let{
        name2 = name
    }
    println(name2)

//    age = 20
//    if (age != Null) {
//        sum = age!! + 10
//    }
//    println(sum)
}