package belajar.generic._08StarProjection

/**
 * Star Projection
 * Kadang ada kasus kita tidak peduli dengan generic parameter type pada objec.t
 * Misal kita hanya ingin mengambil panjang data Array<T>, dan kita tidak peduli dengan isi data T
 * nya
 * Jika kita mengalami kasus seperti ini, kita bisa menggunakan Star Projection
 * Star projection bisa dibuat dengan mengganti generic parameter type dengan karakter * (star,
 * bintang)
 */

// artinya bisa pakai tipe data apapun, dan kita tidak pakai datanya
// kita hanya pake misal length
fun tampilkanArray(array : Array<*>){
    println("tampilkan: ${array.size}")
    println("tampilkan data pertama: ${array.get(0)}")

}

fun main() {
    val arrayInt : Array<Int> = arrayOf(1,2,3)
    val arrayNama : Array<String> = arrayOf("roni", "pashya", "ganish","herta", "Yuli")

    tampilkanArray(arrayInt)
    tampilkanArray(arrayNama)
}