package belajar.oop.`22_Interface`

interface GoInterface {
    fun go()
}
// Note point 03.
// interface inheritance interface
interface  Chatting : Interaction {
    fun chatting()
}

//point 04. karena namanya sama, maka terpaksa harus tahu cara akses yang benar.
 interface MoveA {
     fun move() = println("Move A")
 }

interface MoveB {
    fun move() = println("Move B")
}

// menggunakan 2 interface
// Notes Point 03.
class Animal(override val name: String): Interaction, GoInterface{
    override fun sayHello(name: String) {
        // ini akan selalu minta di overriding karena tidak ada implementasi di interfacenya.
        println("Animal Say hello: $name")
    }

    override fun go() {
        println("Go go go!")
    }
}

//Interface melakukan inheritance interface yang lain
class Person(override val name: String) : Chatting {
    override fun chatting() {
        println("Mari chatting")
    }

    override fun sayHello(name: String) {
        println("Hai, saya ${this.name}, senang bertemu denganmu: $name")
    }

}

class Person2(override val name: String) : Chatting, MoveA, MoveB {
    override fun chatting() {
        println("Mari chatting")
    }

    override fun sayHello(name: String) {
        println("Hai, saya ${this.name}, senang bertemu denganmu: $name")
    }

    override fun move() {
        super<MoveA>.move() // ini cara akses super method yang namanya sama
        // namun di class ini kita bisa pilih mau override yang mana.
        println("Person2 Move via A")
    }

}