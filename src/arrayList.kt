fun main(){
//    var arr = listOf(1, 2, 3, 4, 5, )
//    println(arr)
//    println(arr[0])
//    arr[2] = 3 이 불가능

    var arr = mutableListOf(1, 2, 3, 4, 5,)
    println(arr)
    println(arr[2])

    arr[0] = 10
    println(arr[0])

    arr.removeLast()
    println(arr)

    arr.removeFirst()
    println(arr)

    arr.addLast(e:10)
    arr.addFirst(e:1)

    arr.addAll(index:3, mutableListOf(1,2,3))
    arr.clear()

}