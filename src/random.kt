import kotlin.random.Random

fun main(){
    //Int 중에 랜덤 넘버가 나옴 (from은 0을 포함, until 100을 포함안함)
    //따라서 0~99까지 랜덤
    val randomNumber1 = Random.nextInt(0, 100)

    //0 ~ 0.99
    val randomNumber2 = Random.nextDouble(0.0, 1.0)
    println(randomNumber1)
    println(randomNumber2)
}