package CS.Logical

fun a() : Boolean{
    println("A 함수 안으로 들어왔습니다.")
    return false
}

fun b() : Boolean {
    println("B 함수 안으로 들어왔습니다.")
    return true
}

fun main(){
    if (a() && b()){
        println("이 조건은 참 입니다.")
    } else {
        println("이 조건은 거짓 입니다.")
    }
}






/*
fun a() : Boolean{
    println("A 함수 안으로 들어왔습니다.")
    return false
}

fun b() : Boolean {
    println("B 함수 안으로 들어왔습니다.")
    return true
}

fun main(){
    if (b() or a()){
        println("이 조건은 참 입니다.")
    } else {
        println("이 조건은 거짓 입니다.")
    }
}
 */

