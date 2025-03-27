package belajar.generic._02GenericFunction

/**
 * Generic Function
 * Generic parameter type tidak hanya bisa digunakan pada class atau interface
 * Kita juga bisa menggunakan genericgarameter type di function
 * Generic parameter type yang kita deklarasikan di function, hanya bisa diakses di function tersebut,
 * tidak bisa digunakan di luar function
 * Ini cocok jika kita ingin membuat generic function, tanpa harus mengubah deklarasi class
 */


class Fungsi(val nama : String){


    // jadi fun <kode generic> namaFun(param: kodegeneric)
    fun <T> fungsiHi(param: T){
        //hanya bisa diakses disini
        println("fungsiHi: $param $nama")
    }
    // ini juga T jg tidak masalah beda dengan properties generic type
    fun <T> fungsiHa(param: T){
        println("funsiHa: $param $nama")
    }
    // bisa banyak juga, terserah sih ini
    fun <A,B,C>cetakMulti(param1: A, param2: B, param3 : C){
        println("cetak: $param1 $param2 $param3 dari class: $nama")
    }
}

fun main() {
    val fungsi1 = Fungsi("F1")
    fungsi1.fungsiHi<String>("test")
    fungsi1.fungsiHi("langsung juga bisa") // langsung jg bisa
    fungsi1.fungsiHi(1)
    fungsi1.fungsiHa('C') // char pun bisa
    fungsi1.cetakMulti(1,"b",'X')


}