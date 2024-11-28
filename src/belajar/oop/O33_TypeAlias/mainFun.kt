package belajar.oop.O33_TypeAlias

import belajar.oop.O32_CompanionObject.Application

/**
 *  ----- Type Alias -----
 *  Kotlin mendukung Type Alias
 * Type Alias adalah membuat nama berbeda dari tipe data yang telah ada
 * Biasanya ini digunakan ketika ada tipe data dengan nama yang sama, atau untuk mempersingkat
 * tipe data sehingga kita tidak perlu menulisnya terlalu panjang
 *
 * ----- Type Alias Function -----
 * Type Alias tidak hanya bisa digunakan untuk class saja, namun bisa untuk function
 * Dengan menggunakan Type Alias untuk function, kita akan lebih mudah saat menggunakan
 * function sebagai parameter, karena lebih sederhana
 */

// saya menggunakan Class Application dari package belajar.oop.O32_CompanionObject.Application biar cepet aja
typealias App = Application
typealias aP = App


// untuk akses package lain. dengan nama class yang sama.
typealias aX = belajar.oop.O33_alias.Application


typealias StringSupplier = () -> String // Tanda lambda:  () -> String akan digantikan langsung dengan StringSupplier jadi ketiknya pendek

/** ----- lambda biasa agak ribet nulisnya
 * fun cetakLambda(suplier: () -> String){
 *     println("cetak ${suplier()}")
 * }
 */
// dengan typealias pemanggilan lambda lebih cepat
fun cetakLambda(suplier: StringSupplier){
    println("cetak ${suplier()}")
}

fun main() {

    val a = App("a")
    val ap = aP("a")
    aP.hello("test")
    aX.hello("test 2")

    // lambda biasa akan ribet nulisnya makanya bisa pakai typealias
    cetakLambda { "Eko" }
}