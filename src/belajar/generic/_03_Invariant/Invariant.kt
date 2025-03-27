package belajar.generic._03_Invariant

/**
 * Invariant
 * Secara default, saat kita membuat generic parameter type, Sifat parameter tecsebut adalah
 * invariant
 * Invariant artinya tidak boleh di subtitusi dengan subtype (child) atau supertype (parent)
 * Artinya saat kita membuat object Contoh<String>, maka tidak sama dengan Contoh<Any>,
 * begitupun sebaliknya, saat membuat object Contoh<Any>, maka tidak sama dengan
 * Contoh<String>
 */

class Invariant<A>(var data: A)

fun main() {

    val data1 : Invariant<String> = Invariant("data1")

    // ini akan menghasilkan error karena sifatnya adalah invariant atau tidak boleh di substitusi
    // val data2 : Invariant<Any> = data1
    // karena misal ada code lagi
    // data1.data = 100    // ini akan merubah string jadi Int, nah konflik kan. di kotlin hal itu dilarang

    // namun ada cara agar bisa di substitusi dengan cara covariant
    // substitusi hanya bisa dari class anak ke induk, misal String ke Any
}