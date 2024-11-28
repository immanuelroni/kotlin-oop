package belajar.oop.O34_InlineClass

/**
 * ----- Inline Class -----
 * Kadang kita hanya membuat class dengan satu properties
 * Terlalu banyak class akan ada konsekuensinya, yaitu memakan konsumsi memory yang lebih
 * banyak ketika program kita berjalan
 * Kotlin memiliki kemampuan untuk mengubah class menjadi inline dengan menggunakan kata kunci
 * inline
 */

fun main() {
    val inline = inlineClass("Test1")
   println( inline.cetakCaptipal())
}