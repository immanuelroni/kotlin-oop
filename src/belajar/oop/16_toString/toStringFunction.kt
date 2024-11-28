package belajar.oop.`16_toString`

/**
 * toString() adalah function yang digunakan untuk menampilkan representasi String dari object
 * Saat kita println object, sebenarnya kita memanggil function toString()
 * Standarnya, function toString() akan mengembalikan referensi kode unik dari object
 * Kita bisa meng-override function toString() jika ingin mengubah representasi dari String pada object yang kita mau
 */

fun main() {


    val avanza = Car("Avanza")
    val wuling = Car("Wuling")
    println(avanza)
    println(wuling)
}

