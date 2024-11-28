package belajar.oop.`14_AnyClass`

/**
 * DI kotlin semua class tanpa Parent merupakan child dari Any Class
 * Any adalah superclass untuk semua class yang kita buat di kotlin
 * Any punya function bawaan:
 * equals()
 * hachcode()
 * toString()
 */

fun main() {
    val axioPongo765 = Laptop("axio Pongo 765")

    val oxvaXlimPro1 = Oxva("Oxva Xlim Pro SQ","replaceable","POD")
    println(oxvaXlimPro1.toString())
    println(oxvaXlimPro1.hashCode())
}