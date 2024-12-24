package basic

data class People (
    val name : String,
    val age : Int,
)

fun main(){
    val a = People("Smith", 20)
    val (name, age) = a
    println("구조 분해 : $name, $age")
}