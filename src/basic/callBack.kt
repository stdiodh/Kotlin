package basic

fun main() {
    //인자가 밖으로 빠질 수 있음
    myFunc(10){
        println("함수 호출")
    }
}

//input도 없고 return도 없다.
//앞에 suspend를 붙이면 정지 함수
fun myFunc(a:Int, callBack: () -> Unit){
    println("함수 시작")
    callBack()
    println("함수 끝")
}