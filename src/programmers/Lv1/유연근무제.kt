class 유연근무제 {
    fun solution(schedules: IntArray, timelogs: Array<IntArray>, startday: Int): Int {
        fun safeMinutes(time:Int, minutesToAdd: Int): Int {
            val hour = time / 100
            val minute = time % 100

            // 전체 분으로 변환 후 10분을 더함
            val safeMinute = hour * 60 + minute + minutesToAdd
            val newHour = safeMinute / 60
            val newMinute = safeMinute % 60
            return newHour * 100 + newMinute
        }

        var cnt = 0

        for(i in schedules.indices){
            val scheduleTime = schedules[i]
            val allowTime = safeMinutes(scheduleTime, 10)
            var gift = true

            for(j in 0 until  7){
                //무슨 요일인지 계산(1: 월요일 ~ 7: 일요일)
                val currentDay = ((startday - 1 + j) % 7) + 1
                if(currentDay == 6 || currentDay == 7){
                    continue
                }

                if(timelogs[i][j] > allowTime){
                    gift = false
                    break
                }
            }
            if(gift){
                cnt++
            }
        }
        return cnt
    }
}

fun main(){
    val n = 유연근무제()
    val schedules = intArrayOf(700, 800, 1100)
    val timelogs = arrayOf(
        intArrayOf(710, 2359, 1050, 700, 650, 631, 659),
        intArrayOf(800, 801, 805, 800, 759, 810, 809),
        intArrayOf(1105, 1001, 1002, 600, 1059, 1001, 1100)
    )
    val startday = 5

    println(n.solution(schedules, timelogs, startday))
}