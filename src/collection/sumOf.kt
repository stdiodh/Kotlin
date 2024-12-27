package collection

fun main(){
    val arr = intArrayOf(2,4,6,8,10)

    //일반 반복문
    var sum = 0
    for(x in arr){
       sum += x
    }
    println("배열의 총합 : $sum")

    //sumOf
    val sumOf = arr.sumOf { it }
    println("배열의 총합 : $sumOf")
}