package belajar.oop.`19_AbstracClass`

abstract class Animal {
    abstract val name: String   // jadi kalau abstrac detail propertiesnya akan di set di class childnya, jika di set di sini error.
    abstract fun run(): Unit
}

class Cat : Animal(){
    override val name: String = "Cat"
    override fun run() {
        println("Cat is Run!")
    }
}

class Dog : Animal(){
    override val name: String = "Dog"

    override fun run() {
        println("$name is Run!")
    }

}