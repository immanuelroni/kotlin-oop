package belajar.oop.`09_inheritance`

/**
 * Inheritance / pewarisan
 * adalah sebuah kemampuan untuk menurunkan kemampuan sebuah class ke class yang lain
 * Dalam artian, kita bisa membuat class Parent dan Child
 * Di Kotlin, tiap class Child, hanya bisa punya satu class Parent, namun satu class Parent bisa punya banyak class Child
 * Secara standar, di class yang dibuat Kotlin adalah final (tidak bisa diwarikan), agar bisa diwariskan, kita harus menggunakan kata kunci open
 */

fun main() {
    val manager = Manager("Roni")
    manager.sayHello("Adi")

    val hrd = HRD("Intan")
    hrd.sayHello("Roni")
}