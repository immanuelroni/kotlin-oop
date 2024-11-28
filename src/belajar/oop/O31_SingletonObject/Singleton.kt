package belajar.oop.O31_SingletonObject

// dia tak punya constructor
object Utilities{
    val name = "Utilities"

    fun toUpper(value : String): String {
        return value.uppercase()
    }
}