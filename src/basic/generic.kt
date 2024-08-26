package basic

fun main(){
    val box = Box(10)
    val box2 = Box("값")

    println(box.value)
    println(box2.value)
}

class Box<T>(var value: T){

}