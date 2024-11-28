package belajar.oop.`09_inheritance`

open class Employee(val nama:String) {

    fun sayHello(name:String){
        println("Hi, $name, my name is ${this.nama}")
    }
}

final class Manager(name: String):Employee(name)
final class HRD(name: String):Employee(name)