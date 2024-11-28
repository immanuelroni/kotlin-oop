package belajar.oop.O35_Delegation

interface Base {
    fun sayHi(name : String)
}

class MyBase : Base {
    override fun sayHi(name: String) {
        println("Hi $name")
    }
}

// konsep delegation
// membuat delegation secara manual, agak ribet kalau interfacenya banyak function.
class MyBaseDelegate(val mybase : Base) : Base{
    override fun sayHi(name: String) {
        mybase.sayHi("$name")
    }
}

// cara delegation dengan sederhana
// ini akan sama dengan code di atas ini. lebih simple.
class Delegation(val base : Base) : Base by base {
    // namun bisa juga di override kl mau, yg ga di override bakal dibuatin kotlin.
//    override fun sayHi(name: String) {
//        TODO("Not yet implemented")
//    }
}