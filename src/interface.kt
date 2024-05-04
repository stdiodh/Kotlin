fun main (){

}

//Interface
interface ImplementIdol{
    //자기소개
    fun introduce () : Unit

    //인사
    fun sayHello () : Unit
}

//option + Enter
class Idol(
    var name : String,
    var age : Int,
) : ImplementIdol {
    override fun introduce() {
        TODO("Not yet implemented")
    }

    override fun sayHello() {
        TODO("Not yet implemented")
    }
}
