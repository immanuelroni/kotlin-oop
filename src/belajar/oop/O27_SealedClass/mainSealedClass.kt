package belajar.oop.O27_SealedClass

/**
 * ----- Sealed Class
 * Sealed class merupakan jenis class yang didesain untuk inheritance
 * Sealed class tidak bisa diinstansiasi menjadi object, dan secara standar sealed class merupakan
 * abstract class
 * Sealed class sangat cocok digunakan sebagai class Parent
 *
 * ----- Penggunaan -----
 * Sealed class sangat berguna saat kita menggunakan when expression
 * Dengan menggunakan sealed class, kita bisa membatasi hanya class turunannya yang perlu di
 * check
 */


fun main() {
    val operasiTambah = Tambah()
    val data = operasi(2,2,operasiTambah)
    println(data)

    println(operasi(10,5,Kurang()))
}