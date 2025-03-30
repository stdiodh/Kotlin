package CS

import java.time.Instant
import java.time.LocalDateTime
import java.time.ZonedDateTime

fun main(){
    val localTime : LocalDateTime = LocalDateTime.now()
    val zoneTime : ZonedDateTime = ZonedDateTime.now()
    val instantTime : Instant = Instant.now()

    println("localTime : $localTime")
    println("zoneTime : $zoneTime")
    println("instantTime : $instantTime")

}