package collection

fun main(){
    val ans = (1..10).toList()

    //for문
    var result = 0
    for(x in ans){
        result += x
    }
    println("1부터 10까지의 총합 : $result")

    //reduce 함수 사용
    val reduce = ans.reduce {total, num ->
        println("누적합 : $total")
        total + num
    }
    println("1부터 10까지의 총합 : $reduce")

    //fold 함수
    val arr = (2..10).toList()
    val fold = arr.fold(1) { total, num ->
        total + num
    }
    println("1부터 10까지의 총합 : $fold")

    //fold 비어있는 컬렉션
    val emptyList = emptyList<Int>()
    val emptyFold = emptyList.fold(1){ total, num ->
        total + num
    }
    println("emptyFold : $emptyFold")
}