fun main() {
    var isRunning : Boolean = true
    println(isRunning)
    isRunning = false
    println(isRunning)

    var a : Int = 10
//    a = a + 1
//    a++ // 1을 나중에 더한다 : 후위연산
//    ++a // 1을 먼저 더함 : 전위연산
//    println(a)

    println((a++).toString())
    println(a)

//    var hello : String = "hello"
//    var world : String = "World"
//    문자열 더하기
//    println(hello+' '+world)

    var name : String = "빵빵이"
//    문자열 포맷팅 변수 하나 출력시 {}생략가능
//    println("안녕하세요! ${name} 입니다.!")
    println("안녕하세요! $name 입니다.!")

    var c : Int = 10
    var d : Int = 5

    println(c > d)
    println(c >= d)
    // println안에서도 조건확인 가능
}