fun main() {
//    파이썬과 다른점은 마지막 숫자까지 실행한다는 것
//    for문
//    for (i in 0 .. 10) {
//        println(1)
//    }

    var j : Int = 0
//    while문
    while(j < 5){
        println("while문 " + j)
        j++
    }
    println(j)

    var k : Int = 0
//  do~while 문
    do {
        println("do~While문 " + k)
        k++
    } while (k < 5)
    println(k) // while이랑 do while의 은 조건을 먼저 수행한다는 차이
}