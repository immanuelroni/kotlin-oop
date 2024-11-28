package belajar.oop.`01_Class`

class Person {
    /**
     * Class terdiri dari properties dan fun
     */

    // PROPERTIES
    // jangan pakai val ya, karena tidak bisa di ubah nantinya
    var firstName: String = ""
    // ini kita buat bisa null untuk tujuan belajar aja, sebaiknya jangan dipakai
    var middleName: String? = null
    var lastName:String = ""
}

fun main() {
    val roni = Person()
    println(roni)
}