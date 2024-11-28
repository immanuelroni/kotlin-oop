package belajar.oop.O26_DataClass

/**
 * ----- Data Class -----
 * Kadang kita sering membuat class yang hanya digunakan sebagai representasi dari data
 * Data Class cocok digunakan dalam hal ini
 * Data Class merupakan class yang secara otomatis akan membuatkan function equals, hashCode,
 * toString dan copy dari semua properties yang terdapat di primary constructors yang dimiliki Oleh
 * data class
 *
 * ----- Copy Data Class -----
 * Data class memiliki function copy yang bisa digunakan untuk menduplikasi object.
 * Bahkan metode copy yang terdapat di data class bisa digunakan untuk menduplikasi sekaligus
 * mengubah properties nya
 * mirip prototype design pattern di Java
 */

fun main() {
     val product = ProductDataClass("Baju Jersey",10000,"Pakaian")
    // printnya akan beda dengan yang biasanya
    println(product)

    // copy data class, kalau parameternya kosong maka akan dibuatkan sama dengan objek sebelumnya.
    var product2 = product.copy(name = "Sarimi")
    println(product2)

}