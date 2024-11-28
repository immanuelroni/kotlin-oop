package belajar.oop.`10_functionOverriding`


/**
 * Function Overriding
 * adalah kemampuan membuat ulang function yang sudah ada di class Parent
 * Secara Standart, function di class adalah final, tidak bisa dibuat ulang di class Child
 * Agar fucntion bisa dibuat ulang di class Child, kita harus menggunakan kata kunci open
 */



fun main() {
    val manager = Manager("Roni")
    manager.sayHello("Adi")

    val hrd = HRD("Intan")
    hrd.sayHello("Roni")
}