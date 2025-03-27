package belajar.generic._04Covarint

/**
 * Covariant
 * Covariant artinya kita bisa melakukan subtitusi subtype (child) dengan supertype (parent)
 * Tidak semua jenis class generic yang mendukung covariant, hanya class generic yang
 * menggunakan generic parameter type sebagai return type function
 * Artinya saat kita membuat object Contoh<String>, maka bisa disubtitusi menjadi Contoh<Any>
 * Untuk memberitahu bahwa generic parameter type tersebut adalah covariant, kita perlu
 * menggunakan kata kunci out
 */

// dengan kata kunci out, artinya hanya untuk return type saja. tidak bisa sebagai param input di class ini.
// param yang digunakan juga harus val, agar tidak mungkin diubah saat di instansiasi
class Covariant<out A>(val data: A){

    /**
     * jadi kalau ada out artinnya di dalam class ini tidak boleh ada fungsi, dimana T sebagai param input
     * misal: fun <T> cekData(datanya : T) // ini tidak akan bisa, karena covariant T hanya untuk out, atau return saja
     *
     */
    fun ambilData(): A{
        return data
    }

    // ini akan bahaya, karena didefinisikan sebagai out, atau covariant
//    fun periksaData(param : A){
//        println("periksa data: $param")
//    }
}

fun main() {
    // jadi dari anak ke induk - ingat ya! induknya di inisialisasi dari anak
    val data1 : Covariant<String> = Covariant("data pertama")
    val data2 : Covariant<Any> = data1

    // print : data pertama
    // artinya bisa di substitusi
    println(data2.ambilData())

    // data2.periksaData()
}