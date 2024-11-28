package belajar.oop.`05_PropertiesConstructor`

/**
 * Kotlin mendukung deklarasi properties langsung di primary constructor.
 * Ini sangat berguna untuk mempersingkat saat kita ingin membuat properties, dan mengisi datanya lewat constructor.
 */
fun main() {
    val user1 = User("Roni","pass124")
    val user2= User("Ganish","passxxx")

    user1.usernameP = "Cantiku"
    println(user1.usernameP)
    println(user1.passwordP)

    println(user2.usernameP)
    println(user2.passwordP)
}