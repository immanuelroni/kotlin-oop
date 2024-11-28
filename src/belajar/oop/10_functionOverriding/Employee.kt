package belajar.oop.`10_functionOverriding`


/**
 * Saat kita membuat overriding function, misalnya override fun sayHello(name: String) {}
 * function tsb statusnya akan open, dan bisa di override lagi class child dibawahnya, misal super manager,child dari manager.
 * jadi tambahkan final di depan fucntion agar tidak bisa dioverriding fucntion tersebut
 */

open class Employee(val nama:String) {

    open fun sayHello(name:String){
        println("Hi, $name, my name is ${this.nama}")
    }
}

final class Manager(name: String):Employee(name){
    final override fun sayHello(name: String) {
        // super.sayHello(name)
        println("Hi, $name, my name is Manager: ${this.nama}")
    }
}

//  set class manager final -> open, baru uncomment.
//  Contoh function yang bisa overriding, namun memang Manager harus open status dl.
//    class SuperManager(name: String): Manager(name){
//        override fun sayHello(name: String) {
//             println("Hi, $name, my name is Super Manager: ${this.nama}")
//        }
//    }

final class HRD(name: String):Employee(name){
    override fun sayHello(name: String) {
        //  super.sayHello(name)
        println("Hi, $name, my name is HRD: ${this.nama}")
    }
}