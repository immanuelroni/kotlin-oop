package belajar.oop.`01_Class`.`object`

import belajar.oop.`01_Class`.Person

fun main() {
    // ketika membuat objek baru otomatis akan import class yang terkait
    val namaObj1 = Person()
    val namaObj2 = Person()
    val namaObj3 = Person()

    // ketika dicetak akan nampilkan angka random dari lokasi dari memory, tp gpp cuman buat cek aja
    println(namaObj1)
    println(namaObj2)
    println(namaObj3)

    // cetak objek dari sebuah class Person
    val roniPerson = Person()
    roniPerson.firstName ="Immanuel"
    roniPerson.middleName ="Roni"
    roniPerson.lastName = "Handoko"

    // cara akses properties dari sebut objek
    println("Orang ini adalah: ${roniPerson.firstName}, ${roniPerson.middleName}, ${roniPerson.lastName}")

}