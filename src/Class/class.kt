package Class

class User (val name : String, val age : Int){
    init {
        println("User가 생성되었습니다! 이름 : $name, 나이 : $age")
    }
}

fun main(){
    val newUser = User("DH", 24) //User가 생성되었습니다! 이름 : DH, 나이 : 24
}