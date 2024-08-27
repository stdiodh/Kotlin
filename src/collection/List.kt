package collection

//fun main() {
//    val numbers = listOf("one", "two", "three", "four")
//    println("인덱스 사이즈 : ${numbers.size}")
//    println("세번째 요소: ${numbers.get(2)}")
//    println("네번째 요소 : ${numbers[3]}")
//    println("요소의 \"두 번째는? \" ${numbers.indexOf("two")}")
//}

data class Person( var name : String, var age : Int)

fun main() {
    val bob = Person( "Bob", 31)
    val people1 = listOf( Person ("Adam", 28), bob, bob)
    val people2 = listOf( Person ("Adam", 28), Person( "Bob", 31), bob)
    println(people1 == people2)
    bob.age = 32
    println(people1 == people2)
}