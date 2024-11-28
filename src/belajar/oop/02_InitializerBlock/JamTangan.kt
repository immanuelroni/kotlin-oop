package belajar.oop.`02_InitializerBlock`

/**
 * Initializer Block adalah block kode yang akan dieksekusi ketika constructor dipanggil
 * Kita bisa memasukkan kode program di dalam initializer block
 */
class JamTangan(brand: String,
                tahun: Int,
                type: String){

    // ini gak bisa langsung asal buat println()
    init {
        /**
         * Jangan isi dengan function yang terlalu berat, agar saat tiap class dibuatkan obj tidak berat.
         */
        println("ini adalah initializer Block") // akan dijalankan otomatis ketika obj class dibuat.
        println("Jam Tangan Dibuat")
    }
}


