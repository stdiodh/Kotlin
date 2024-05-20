import java.util.Scanner

fun main(){
    println("입력할 값1 : ")
    val reader1 = Scanner(System.`in`)
    println("입력할 값2 : ")
    val reader2 = Scanner(System.`in`)

    reader1.nextInt()
    reader2.next()

    println("입력 받은 값 : $reader1, $reader2")
}