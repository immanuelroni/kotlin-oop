package belajar.collection.List

/**
 * Pair
 * Sebelum kita bahas collection Map, ada baiknya kita mengenal Pair
 * Pair adalah representasi dari data yang beresangan
 * Di Map, Pair digunakan sebagai data Map ketika pertama kali Map dibuat
 */

fun main() {

    println("cetak pair")
    val pair = Pair("A","1")
    println(pair.first)
    println(pair.second)

    val pair2 : Pair<String,String> = "A" to "2" // cara panggil lain, via infix notation, ctrl klik kl mau liat
    println(pair2.first)
    println(pair2.second)
}