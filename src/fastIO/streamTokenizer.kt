package fastIO

import java.io.InputStreamReader
import java.io.StreamTokenizer

fun main(){
    val tokenizer = StreamTokenizer(InputStreamReader(System.`in`))
    print("입력 (Ctrl+D 입력 시 종료) : ")
    while(true){
        val tokenType = tokenizer.nextToken()
        when(tokenType){
            StreamTokenizer.TT_NUMBER -> {
                println("입력이 정수면? : ${tokenizer.nval.toInt()}")
            }
            StreamTokenizer.TT_WORD -> {
                println("입력이 문자열이면? : ${tokenizer.sval}")
            }
            StreamTokenizer.TT_EOF -> {
                println("입력 종료.")
                break
            }
            else -> {
                println("Char : '{${tokenizer.ttype.toChar()}}'")
            }
        }
    }
}