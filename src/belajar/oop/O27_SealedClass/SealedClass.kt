package belajar.oop.O27_SealedClass

sealed class Operasi(val nama: String)
class Tambah : Operasi("tambah")
class Kurang : Operasi("kurang")

/**
 * penggunaan sealed class biasanya untuk return when lebih enak, karena when akan tahu
 * bahwa pilihanya hanya ada sesuai class childnya.
 */

fun operasi(value1: Int, value2: Int, operasi: Operasi): Int {
    return when (operasi){
        // pilihannya akan sesuai dengan class child dari sealed class, jd misal kurang ada notify
        is Tambah -> value1 + value2
        is Kurang -> value1 - value2
    }
}