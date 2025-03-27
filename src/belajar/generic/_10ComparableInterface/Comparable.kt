package belajar.generic._10ComparableInterface

/**
 * Comparable
 * Sebelumnya kita sudah tahu bahwa operator perbandingan == dan != akan menggunakan metode equals sebagai implementasinya.
 * Bagaimana dengan operator perbandingan lainnya? Seperti > >= < <= ?
 * Operator perbandingan tersebut bisa kita lakukan, jika object kita mewariskan interface generic Comparable
 */

// jadi kita implement Interface Comparable
class  Fruits (val nama : String, val quantiti : Int) : Comparable<Fruits>{

    // jadi kita nggk perlu pake if bandingkan satu per satu yang akan lama.
    override fun compareTo(other: Fruits): Int {
        return quantiti.compareTo(other.quantiti)
    }

}

fun main() {
    val buah1  = Fruits("Mangga",10)
    val buah2 = Fruits("Melon", 5)
    // jika >1 artinya gede yang kiri
    // kl 0 artinya sama
    // kl negatif artinya gede yang kanan.
    println(buah1.compareTo(buah2))

    // bisa juga, Ctrl + klik aja comparablenya, untuk cek
    println(buah1>=buah2)
}