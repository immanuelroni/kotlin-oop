package belajar.oop.`11_propertiesOverriding`

/**
 *   Selain function, properties juga bisa dioverriding
 *   Ini berbeda dengan Java, Java tidak bisa melakukannya
 *   Secara standart, properties di class bersifat final, tidak bisa dibuat ulang di class Child
 *   Agar bisa dibuat ulang, kita harus gunakan kata kunci open
 */

fun main() {
    val shape = Shape()
    println(shape.corner)

    val shape2 = Rectangle()
    println(shape2.corner)

    val shape3 = Triangle()
    println(shape3.corner)
}