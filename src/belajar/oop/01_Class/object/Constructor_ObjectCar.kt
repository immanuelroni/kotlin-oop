package belajar.oop.`01_Class`.`object`

import belajar.oop.`01_Class`.Car

fun main() {
    val avanza = Car("Toyota",2021)
    val almaz = Car("Wuling", 2024)

    avanza.year = 2022 // ubah tahunnya

    println(avanza.brand)
    println(avanza.year)
    println(almaz.brand)
    println(almaz.year)
}