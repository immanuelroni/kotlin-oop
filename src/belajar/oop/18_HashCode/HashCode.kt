package belajar.oop.`18_HashCode`

import belajar.oop.`17_Equals`.Company

/**
 * hashCode adalah function yang digunakan sebagai representasi angka unit untuk objek yang kita buat
 * Function hashCode sangat berguna saat kita ingin mengkonversi objek kita menjadi angka
 * Salah satu penggunaan hashCode yang banyak dilakukan adalah di struktur data, misal untuk
 * memastikan tidak ada data duplicate, agar lebih mudah, di cek nilai hashCode nya,jika hashCode sama, maka dianggap objectnya sama
 */

fun main() {
    val company1 = Company("PT A")
    val company2 = Company("PT A")

    // secara default akan false.
    // namun bisa saya overriding jadi true, dengan membandingkan hashCode dari nama class.
    println(company1.hashCode()==company2.hashCode())
    println(company1) // ini akan unik
    println(company2)   // ini akan unik
}