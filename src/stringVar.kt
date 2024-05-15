fun main() {
    var name1 : String = "빵빵이"
    var name2 : String = "Hyun"

    //모두 대문자로 바꿈
    println(name2.uppercase())
    //모두 소문자로 바꿈
    println(name2.lowercase())


    println(name1)
    println(name1[2]) //인덱스로도 가져오는 게 가능

    name1 = "옥지" // 변수라 값 변경 가능
    println(name1)

    println("제 이름은 " + name1 + "입니다.")
    // $를 통해 변수 넣는 것도 가능
    println("제 이름은 $name1 입니다.")
    // {}로 감싸기도 되고 안에서 수식도 사용 가능
    println("제 이름은 ${name1+10} 입니다.")
}