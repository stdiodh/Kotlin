fun main(){
    var i = 10
    var j = 20L

//    j = i 타입이 달라 들어가지 않음
    // .to타입() 형식으로 타입 변경 가능
    j = i.toLong()
    i = j.toInt()

}