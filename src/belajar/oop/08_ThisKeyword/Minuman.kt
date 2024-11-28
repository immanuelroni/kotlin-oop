package belajar.oop.`08_ThisKeyword`

/**
 * This Keyword
 * - this adalah keywrod yang bisa digunakan untuk mereferensikan object saat ini
 * - this. hanya bisa digunakan di dalam class itu sendiri
 * - Biasanya, this digunakan untuk mengakses properties yang tertutup oleh param dengan nama yang sama
 */


class Minuman(val namaMinuman: String) {

    fun cetakMerkMinuman(namaMinuman: String){
        println("Merk Minuman ini : $namaMinuman")
        // this digunakan untuk mengakses data pada Param Objek Minuman namaMinuman.
        // dengan this, yang di akses adalah param para constructor class.
        println("Jenis Minuman: ${this.namaMinuman}")
    }
}

fun main() {
    var minuman = Minuman("Teh")
    minuman.cetakMerkMinuman("Danone")
}