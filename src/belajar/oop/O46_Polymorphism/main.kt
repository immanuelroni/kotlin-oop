package belajar.oop.O46_Polymorphism

import belajar.oop.`09_inheritance`.Employee
import belajar.oop.`09_inheritance`.HRD
import belajar.oop.`09_inheritance`.Manager

/**
 * Polumorphism
 * Polymorphism berasal dari bahasa Yunani yang berarti banyak bentuk.
 * Dalam OOP, Polymorphism adalah kemampuan sebuah object berubah bentuk menjadi bentuk lain
 * Polymorphism erat hubungannya dengan Inheritance
 */

fun main() {

    // objek pekerja1 bisa berubah bentuk dari Employee ke Manager dan ke HRD
    var pekerja1 : Employee = Employee("pekerja1")
    pekerja1.sayHello("Hi")

    pekerja1 = Manager("Joni")
    pekerja1.sayHello("Hu")

    pekerja1 = HRD("Sani")
    pekerja1.sayHello("He")


}
