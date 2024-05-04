fun main() {
//    var idol1 : Idol = Idol()
//    println(idol1) // 자기 이름과 해쉬 코드를 보여줌
//    var idol2 : Idol = Idol()
//    println(idol2)

    var yujin1 : Idol = Idol("안유진", 22, "아이브") // 포지셔널 파라미터
    var yujin2 : Idol = Idol("안유진", 22, "아이브")
    println(yujin1 == yujin2) // 그냥 클래스로 하면 뒤에 해쉬코드가 달라 false를 출력

    //named constranter는 파라미터 이름을 선언해주고 값을 넣어줌
    //그럼 순서를 바꿔도 입력가능 (그리고 이것을 많이씀)
//    println(yujin.name)
//    yujin.name = "유진" // 세터 인데 쓰는건 좋지 않음
//    println(yujin.name)
//    yujin.introduce()
//    println(yujin.hobby)


//    var anyujin : KIdol = KIdol("안유진", 22, "아이브")
//    println(anyujin.name)
//    println(anyujin.age)

}

// class 설계도면
// ex) idol의 맥락과 같음 직업은 같지만 세부 정보가 다름
// data class는 출력을 모든 데이터 값으로 바꿔줌

//kotlin은 ()안에 정보를 넣음
data class Idol(
    var name : String,
    var age : Int,
    private var group : String,
    //private는 지역변수를 바뀌며 외부에서 못 바꿈, 기본값은 public
) {
    var hobby: String = "sing"
        private set // 외부에서 접근 불가
        get() { // getter로 행동을 실행가능
            println("취미 : $field")
            return field
        }

    //init은 return과 비슷하며 스트럭트가 생성되고 할 일을 더 줄때 실행됨
    init {
        println("Idol 객체가 생성되었습니다.")
    }

    fun introduce(): Unit {
        println("자기소개")
    }

    // toString으로 Idol타입을 받아서 메소드를 실행하며 반환 값은 String으로 내보냄
//    fun Idol.toStringType() : String = "이름 : $name, 나이 : $age, 그룹 : $group"
}

    //상속 open eqauls and hashcode command + n
//     open class Human(
//        var name : String,
//        var age : Int,
//    ) {
//        fun introduce() = println("안녕하세요")
//    }
//
//    class KIdol(name: String, age: Int) : Human(name, age){
//        override fun introduce() = println("안녕하세요 $name 입니다!")
//    }

//

