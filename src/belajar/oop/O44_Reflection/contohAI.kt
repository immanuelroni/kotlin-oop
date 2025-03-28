package belajar.oop.O44_Reflection

import kotlin.reflect.KProperty1
//import kotlin.reflect.full.memberProperties

data class Person(val name: String, val age: Int)

fun main() {
    val person = Person("Andi", 30)

    // Menggunakan reflection untuk mendapatkan informasi tentang properti dari class Person
    val kClass = person::class
    println("Class Name: ${kClass.simpleName}")

//    kClass.memberProperties.forEach { property ->
//        property as KProperty1<Any, *>
//        println("Property Name: ${property.name}, Value: ${property.get(person)}")
//    }
}


