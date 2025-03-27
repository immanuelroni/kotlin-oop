package belajar.generic._09TypeErasure

/**
 * Type Erasure
 * Type erasure adalah proses pengecekan generic pada saat compile time, dan menghiraukan pengecekan pada saat runtime
 * Type erasure menjadikan informasi generic yang kita buat akan hilang ketika kode program kita telah di compile menjadi binary file
 * Compiler akan mengubah generic parameter type menjadi tipe Any (atau Object di Java)
 */

// disini tidak terlihat memang. saat di kompile saja. nanti di compile time akan diubah jd Object semua.
class TypeErasure<T>(param: T){
    private val data : T = param
    fun ambilData() : T = data
}

/**
 * Masalah
 * Karena informasi generic hilang ketika sudah menjadi binary file
 * Oleh karena itu, konversi tipe data generic akan berbahaya jika dilakukan secara tidak bijak
 */

fun main() {
    val data = TypeErasure<String>("Roni")
    val name = data.ambilData()

    val data2 = data as TypeErasure<Int> // String di paksa ke ke Int Object
//    val number = data2.ambilData() // error runtime
//    println(name)
}