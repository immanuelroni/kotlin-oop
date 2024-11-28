interface InterfaceA {
    fun printMessage() {
        println("Interface A message")
    }
}

interface InterfaceB {
    fun printMessage() {
        println("Interface B message")
    }
}

class MyClass : InterfaceA, InterfaceB {
    // Mengatasi konflik dengan delegasi eksplisit
    override fun printMessage() {
        // Menyelesaikan konflik dengan memanggil kedua interface secara eksplisit
        super<InterfaceA>.printMessage()
        super<InterfaceB>.printMessage()
    }
}

fun main() {
    val myClass = MyClass()
    myClass.printMessage()  // Output: Interface A message
    //         Interface B message
}
