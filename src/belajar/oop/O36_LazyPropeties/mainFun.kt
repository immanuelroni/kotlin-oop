package belajar.oop.O36_LazyPropeties

/**
 * ----- lazy properties -----
 * Selain delegating di class, Kotlin mendukung delegating di properties. Namun materi ini tidak akan
 * dibahas disini, karena butuh mengerti dahulu tentang Generic Programming. Materi Delagating di
 * Properties akan dibahas di series Kotlin Generic
 * Salah satu implementasi delegating properties yang sudah disediakan Oleh Kotlin adalah, lazy properties
 * Lazy adalah standar library yang telah disediakan agar properties baru diinisialisasi ketika
 * properties itu diakses
 */

fun main() {
     val sapi = Hewan()
    // jadi lazy properties akan di assigned bila dipanggil saja, kalau tidak ya tidak akan dipanggil
    println(sapi.makanan)
    println(sapi.makanan)
    println(sapi.makanan)

}