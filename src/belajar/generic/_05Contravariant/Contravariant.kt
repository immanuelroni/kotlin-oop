package belajar.generic._05Contravariant

/**
 * Contravarian
 * Contravariant artinya kita bisa melakukan subtitusi supertype (parent) dengan subtype (child)
 * Tidak semua jenis class generic yang mendukung contravariant, hanya class generic yang
 * menggunakan generic parameter type sebagai parameter function
 * Artinya saat kita membuat object Contoh<Any>, maka bisa disubtitusi menjadi Contoh<String>
 * Untuk memberitahu bahwa generic parameter type tersebut adalah covariant, kita perlu
 * menggunakan kata kunci in
 */

class Contravariant<in A>{

    // karena in maka dia harus hanya sebagai param in ke class ini. bukan sebagai return value.
    fun cetakNama(nama: A){
        return println("cetak nama: $nama")
    }


//     fun ambilData(): A{
//         return data
//     }
}

fun main() {

    // Jadi dia bisa substitusi dari Parent ke Child, Any ke String
    // anak dibuat dari induk
    val data1: Contravariant<Any> = Contravariant()
    val data2: Contravariant<String> = data1
    data2.cetakNama("tes")
    // data2.cetakNama(1) // ini gak bisa ya harus string.
}