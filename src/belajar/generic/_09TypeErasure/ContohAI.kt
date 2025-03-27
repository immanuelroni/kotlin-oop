package belajar.generic._09TypeErasure

// Fungsi ini tidak mungkin dilakukan karena type erasure
// fun <T> createArray(size: Int): Array<T> {
//     return Array<T>(size) { null } // Ini akan menghasilkan kesalahan
// }

// Solusi yang biasa digunakan
inline fun <reified T> createArrayWithReified(size: Int): Array<T?> {
    return arrayOfNulls<T>(size)
}

fun main() {
    // Menggunakan reified untuk mendapatkan informasi tipe
    val stringArray = createArrayWithReified<String>(5)
    val intArray = createArrayWithReified<Int>(3)
    for ( i in intArray){
        println(i)
    }
}