package programmers.Lv0

class `이차원배열대각선순회하기` {
    fun solution(board: Array<IntArray>, k: Int): Int {
        var answer: Int = 0
        for(i in board.indices){
            for(j in board[i].indices)
            if(i + j <= k){
                answer += board[i][j]
            }
        }
        return answer
    }
}

fun main(){
    val n = 이차원배열대각선순회하기()
    val board = arrayOf(
        intArrayOf(0,1,2),
        intArrayOf(1,2,3),
        intArrayOf(2,3,4),
        intArrayOf(3,4,5)
    )
    val k = 2

    println(n.solution(board, k))
}