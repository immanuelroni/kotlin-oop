package belajar.generic._06GenericConstraints

/**
 * Kata kunci where
 * Kadang kita ingin membatasi tipe data dengan beberapa jenis tipe data di generic parameter type
 * Secara default, hanya satu tipe data yang bisa digunakan untuk membatasi generic parameter type
 * Jika kita ingin menggunakan lebih dari satu tipe data, kita bisa menggunakan kata kunci where
 */

interface FasilitasDinas{
   fun mobilDinas(namaMobil : String)
}

open class Pegawai

class DPR : Pegawai(), FasilitasDinas{
    override fun mobilDinas(namaMobil: String) {
        println("mendapatkan fasilitas dinas mobil $namaMobil dari negara")
    }
}
// ini deklarasi where kalau dia child dari class Pekerja dan juga child FasilitasDinas
class Instansi<T>(val pekerjaan: T) where T: Pegawai, T : FasilitasDinas

fun main() {
    // val data1 = Instansi(Pegawai)
    // ini tidak akan bisa karena Instansi harus Pegawai dan juga child FasilitasDinas
    // jadi yang bisa cuma DPR saja. krn bisa keduanya
    val data2 = Instansi(DPR())
    data2.pekerjaan.mobilDinas("Avanza")
}