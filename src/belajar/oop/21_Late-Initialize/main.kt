package belajar.oop.`21_Late-Initialize`

/**
 * Standarnya, properties di Kotlin wajib di inisialisasi di awal saat deklarasi properties tersebyt
 * Namun di Kotlin kita juga bisa menunda inisialisasi data para properties
 * Dengan menggunakan kata kunci lateinit, kita bisa membuat properties tanpa harus langsung
 * mengisi datanya
 * Kata kunci lateinit hanya bisa digunakan di var, tidak bisa digunakan di val
 */

fun main() {
    val tv1 = Television()
    //println(tv1.brand) // ini akan error karena init belum di inisialisasi
    //caranya
    //1.
    tv1.initTelevision("Test") // ini lakukan dulu baru di priint
    //2.
    tv1.brand = "Test TV init" // ini juga bisa, jd asal di init dulu, atau kasih nilai.
    println(tv1.brand)

}
