package basic

fun main (){
    println("이름 : ")
    var readerToString = readLine().toString()

    println("나이 : ")
    //readLine은 기본적으로 String?이기 때문에 !!가 들어가야 형 변화 가능
    var readerToInt = readLine()!!.toInt()

    println("이름 : $readerToString, 나이 : $readerToInt")

    var inputCharArray = readLine()!!.toCharArray()
    /*
    contentToString()을 통해 배열로 변환 가능
     */
    println(inputCharArray.contentToString())
//    println("${inputCharArray[3]}")

    var inputIntArray = readLine()!!.toCharArray().map { it.digitToInt()}.toTypedArray()
    println(inputIntArray.contentToString())
//    println("${inputIntArray[3]}")
}