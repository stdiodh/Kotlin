import java.util.LinkedList
import kotlin.concurrent.thread

// 백화점 (부모 클래스)
open class Department(val name: String) {
    open fun storeIntrodution(): String {
        return "여기는 A&I 백화점입니다!"
    }
}

// 상점 (자식 클래스)
class Store(name: String) : Department(name) {
    override fun storeIntrodution(): String {
        return "여기는 A&I 백화점 안에 $name 매장입니다!"
    }
}

// 손님 등급 정의 (우선순위 배정)
enum class CustomerGrade(val priority: Int) {
    normal(3),
    vip(2),
    vvip(1)
}

// 손님 대기열 우선순위 큐
data class Customer(val name: String, val grade: CustomerGrade) : Comparable<Customer> {
    override fun compareTo(other: Customer): Int {
        return this.grade.priority - other.grade.priority
    }
}

fun main() {
    val store = Store("Casetify")
    println(store.storeIntrodution())

    // 20명 손님 (우선순위 없이 추가)
    val customers = listOf(
        Customer("손님1", CustomerGrade.normal),
        Customer("손님2", CustomerGrade.normal),
        Customer("손님3", CustomerGrade.vvip),
        Customer("손님4", CustomerGrade.normal),
        Customer("손님5", CustomerGrade.vip),
        Customer("손님6", CustomerGrade.normal),
        Customer("손님7", CustomerGrade.normal),
        Customer("손님8", CustomerGrade.normal),
        Customer("손님9", CustomerGrade.normal),
        Customer("손님10", CustomerGrade.normal),
        Customer("손님11", CustomerGrade.vip),
        Customer("손님12", CustomerGrade.normal),
        Customer("손님13", CustomerGrade.normal),
        Customer("손님14", CustomerGrade.normal),
        Customer("손님15", CustomerGrade.normal),
        Customer("손님16", CustomerGrade.normal),
        Customer("손님17", CustomerGrade.normal),
        Customer("손님18", CustomerGrade.normal),
        Customer("손님19", CustomerGrade.normal),
        Customer("손님20", CustomerGrade.vvip)
    )

    // 대기열에 추가할 추가 손님들
    val addCustomers = listOf(
        Customer("손님21", CustomerGrade.normal),
        Customer("손님22", CustomerGrade.vip),
        Customer("손님23", CustomerGrade.normal),
        Customer("손님24", CustomerGrade.vvip),
        Customer("손님25", CustomerGrade.normal)
    )

    // 기존 대기열 큐 (20명 손님)
    val queue = LinkedList<Customer>()
    queue.addAll(customers)

    // 새로운 대기열 큐 (20명 이후 추가 손님들)
    val newQueue = LinkedList<Customer>()

    newQueue.addAll(addCustomers)

    println("대기열 현황 (VVIP > VIP > Normal 순으로 우선순위 정렬)")
    newQueue.sort()
    newQueue.forEach {
        println("${it.name} (${it.grade})")
    }

    // 1초마다 손님이 나가고 대기열에 새로운 손님을 추가하는 스레드 실행
    thread(start = true) {
        while (queue.isNotEmpty() || newQueue.isNotEmpty()) {
            if (queue.isNotEmpty()) {
                val leavingCustomer = queue.poll()
                println("${leavingCustomer.name} 손님이 나갔습니다!")
            }

            // 새로운 대기열 큐에서 손님을 20명 큐에 추가
            if (newQueue.isNotEmpty()) {
                val newCustomer = newQueue.poll()
                queue.add(newCustomer)
                println("${newCustomer.name} 님이 매장에 입장하였습니다.")
            }

            Thread.sleep(1000)
        }

        println("모든 손님이 나갔습니다.")
    }
}
