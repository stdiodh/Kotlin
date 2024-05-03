fun main(){
//    코드 유지보수 상으로 배열 뒤 ,를 사용하는 것이 좋음
//    var arr = listOf(1, 2, 3, 4, 5, )
//    println(arr)
//    println(arr[0])
//    arr[2] = 3 이 불가능


//  mutable의 차이는 나중에 배열의 원소들을 바꿀 수 있는지의 차이
    var arr = mutableListOf(1, 2, 3, 4, 5, )
    println(arr)
    println(arr[2])

    arr[0] = 10
    println(arr[0])

    arr.removeLast()
    println(arr)

    arr.removeFirst()
    println(arr)

//    arr.addLast(e:10)
//    arr.addFirst(e:1)
//
//    arr.addAll(index:3, mutableListOf(1,2,3))
//    arr.clear()

}