package Class

class User (val name : String, val age : Int){
    init {
        if(name.length > 3){
            throw IllegalArgumentException("이름은 3글자를 넘어갈 수 없습니다.")
        }
        println("User가 생성되었습니다! 이름 : $name, 나이 : $age")
    }
}

fun main(){
    val newUser = User("HDH1234", 24) //Exception in thread "main" java.lang.IllegalArgumentException: 이름은 3글자를 넘어갈 수 없습니다.
}