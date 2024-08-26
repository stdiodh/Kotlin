package basic

fun main(){
    var items = listOf(1,2,3,4,5)

    //for in문
    for (item in items){
        println(item)
    }

    //0~3 까지기에 3이 포함되어 나옴
//    for (i in 0..3){
//        print(i)
//    }

    //자기 자신을 포함 하지 않으려면 -1을 해야함
    //본 방식은 1번 방법으로 해야 효율적임
    for (i in 0..items.size-1){
        println(items[i])
    }
}