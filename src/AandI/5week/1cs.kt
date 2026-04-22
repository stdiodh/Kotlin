package AandI.`5week`

import java.time.LocalDateTime
import java.util.PriorityQueue

enum class Grade {
    NORMAL,
    VIP,
    VVIP,
    VVVIP
}

data class LogEntry(
    val timestamp: LocalDateTime,
    val user: String,
    val grade: Grade,
    val action: String,
    val order: Int
)

data class WaitingUser(
    val requestTime: LocalDateTime,
    val user: String,
    val grade: Grade,
    val order: Int
)

data class ActiveUser(
    val admittedAt: LocalDateTime,
    val exitTime: LocalDateTime,
    val user: String,
    val grade: Grade,
    val order: Int
)

/**
 * 로그 문자열을 LogEntry로 파싱
 */
fun parseLog(line: String, order: Int): LogEntry {
    val parts = line
        .removePrefix("[")
        .removeSuffix("]")
        .split("][")

    require(parts.size == 4) { "잘못된 로그 형식: $line" }

    val grade = when (parts[2]) {
        "VIP" -> Grade.VIP
        "VVIP" -> Grade.VVIP
        "VVVIP" -> Grade.VVVIP
        else -> Grade.NORMAL
    }

    return LogEntry(
        timestamp = LocalDateTime.parse(parts[0]),
        user = parts[1],
        grade = grade,
        action = parts[3],
        order = order
    )
}

/**
 * 유저의 로그인 / 대기열 / 자동 퇴장을 관리하는 GateKeeper
 */
class GateKeeper(
    private val capacity: Int,
    private val staySeconds: Int
) {
    // 현재 접속 중인 유저 관리
    private val activeUsers = mutableMapOf<String, ActiveUser>()

    // 자동 퇴장 순서 관리
    private val exitQueue = PriorityQueue<ActiveUser>(
        compareBy<ActiveUser> { it.exitTime }
            .thenBy { it.admittedAt }
            .thenBy { it.order }
    )

    // 대기열 관리
    private val waitingQueue = PriorityQueue<WaitingUser>(
        compareBy<WaitingUser> { -gradePriority(it.grade) }
            .thenBy { it.requestTime }
            .thenBy { it.order }
    )

    // 중복 대기 여부 확인
    private val waitingNames = mutableSetOf<String>()

    private var enterCount = 0
    private var jinsungRecorded = false
    private val result = mutableListOf<Any>()

    /**
     * 등급 우선순위 비교용
     * 높을수록 먼저 입장
     */
    fun gradePriority(grade: Grade): Int {
        return when (grade) {
            Grade.NORMAL -> 1
            Grade.VIP -> 2
            Grade.VVIP -> 3
            Grade.VVVIP -> 4
        }
    }

    /**
     * 실제 서버 입장 처리
     */
    private fun admit(user: String, grade: Grade, admittedAt: LocalDateTime, order: Int) {
        val activeUser = ActiveUser(
            admittedAt = admittedAt,
            exitTime = admittedAt.plusSeconds(staySeconds.toLong()),
            user = user,
            grade = grade,
            order = order
        )

        activeUsers[user] = activeUser
        exitQueue.offer(activeUser)
        enterCount++

        if (user == "진성이" && !jinsungRecorded) {
            result.add(admittedAt.toString())
            result.add(enterCount)
            jinsungRecorded = true
        }
    }

    /**
     * currentTime 시각까지 퇴장해야 하는 유저 제거
     */
    private fun removeExpired(currentTime: LocalDateTime) {
        while (exitQueue.isNotEmpty() && !exitQueue.peek().exitTime.isAfter(currentTime)) {
            val expired = exitQueue.poll()
            activeUsers.remove(expired.user)
        }
    }

    /**
     * 대기열의 유저를 우선순위대로 입장
     */
    fun fillSlots(currentTime: LocalDateTime) {
        while (activeUsers.size < capacity && waitingQueue.isNotEmpty()) {
            val next = waitingQueue.poll()
            waitingNames.remove(next.user)
            admit(next.user, next.grade, currentTime, next.order)
        }
    }

    /**
     * 로그 처리
     */
    fun process(logs: List<LogEntry>): List<Any> {
        var logIndex = 0

        while (logIndex < logs.size || exitQueue.isNotEmpty()) {
            val nextLogTime = if (logIndex < logs.size) logs[logIndex].timestamp else null
            val nextExitTime = exitQueue.peek()?.exitTime

            val currentTime = when {
                nextLogTime != null && nextExitTime != null -> minOf(nextLogTime, nextExitTime)
                nextLogTime != null -> nextLogTime
                nextExitTime != null -> nextExitTime
                else -> break
            }

            // 1. 현재 시각까지 자동 퇴장 처리
            removeExpired(currentTime)

            // 2. 빈자리 있으면 대기열 충원
            fillSlots(currentTime)

            // 3. 현재 시각의 로그인 로그 처리
            while (logIndex < logs.size && logs[logIndex].timestamp == currentTime) {
                val log = logs[logIndex]

                if (log.action == "LOGIN") {
                    val alreadyActive = activeUsers.containsKey(log.user)
                    val alreadyWaiting = waitingNames.contains(log.user)

                    if (!alreadyActive && !alreadyWaiting) {
                        if (activeUsers.size < capacity) {
                            admit(log.user, log.grade, currentTime, log.order)
                        } else {
                            waitingQueue.offer(
                                WaitingUser(
                                    requestTime = currentTime,
                                    user = log.user,
                                    grade = log.grade,
                                    order = log.order
                                )
                            )
                            waitingNames.add(log.user)
                        }
                    }
                }

                logIndex++
            }
        }

        return result
    }
}

/**
 * 최종 solution 함수
 */
fun solution(n: Int, s: Int, logs: List<Any>): List<Any> {
    if (logs.isEmpty()) return emptyList()

    val parsedLogs = logs
        .mapIndexed { index, line -> parseLog(line.toString(), index) }
        .sortedWith(
            compareBy<LogEntry> { it.timestamp }
                .thenBy { it.order }
        )

    val gateKeeper = GateKeeper(
        capacity = n,
        staySeconds = s
    )

    return gateKeeper.process(parsedLogs)
}

fun main() {
    val logs = listOf(
        "[2026-04-01T13:00:00][철수][NORMAL][LOGIN]",
        "[2026-04-01T13:00:00][영희][NORMAL][LOGIN]",
        "[2026-04-01T13:00:02][민수][VIP][LOGIN]",
        "[2026-04-01T13:00:02][진성이][VVVIP][LOGIN]"
    )

    val result = solution(2, 4, logs)
    println(result) // [2026-04-01T13:00:04, 3]
}
