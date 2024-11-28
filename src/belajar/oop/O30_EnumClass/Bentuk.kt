package belajar.oop.O30_EnumClass

enum class Bentuk(val keterangan: String) {
    BULAT("Bulat"),
    KOTAK("Kotak"); // di akhiri titik koma

    fun cetakBentuk(){
        println(keterangan)
    }
}