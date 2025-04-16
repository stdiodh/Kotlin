package Class

class Box (val width: Int){
    fun printWidth(){
        println("너비 : ${this.width}")
    }
}

fun main(){
    val box = Box(25).printWidth() //너비 : 25
}
