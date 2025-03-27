package belajar.generic._06GenericConstraints

/**
 * Generic Constraints
 * Kadang kita ingin membatasi data yang boleh digunakan di generic parameter type
 * Kita bisa menambahkan constraint di generic parameter type dengan menyebutkan tipe yang
 * diperbolehkan
 * Secara otomatis, type data yang bisa digunakan adalah type yang sudah kita sebutkan, atau
 * class-class turunannya
 * Secara default, constraint type untuk generic parameter type adalah Any, sehingga semua tipe data
 * bisa digunakan
 */
open class Pekerja

class PNS : Pekerja()
class Buruh : Pekerja()

/**
 * Where Keyword
 * Kadang kita ingin membatasi tipe data dengan beberapa jenis tipe data di generic parameter type
 * Secara default, hanya satu tipe data yang bisa digunakan untuk membatasi generic parameter type
 * Jika kita ingin menggunakan lebih dari satu tipe data, kita bisa menggunakan kata kunci where
 */

// definisi generik, nanti yang bisa di instansiasi hanya Pekerja dan turunannya
// jadi dibatasi hanya class tertentu yang bisa digunakan
class Pabrik<T : Pekerja>(val pekerja : T)

fun main() {

    val orang1 = Pabrik(PNS())
    val orang2 = Pabrik(Buruh())
    val orang3 = Pabrik(Pekerja())
//    val orang4 = Pabrik("error") // ini akan error

}