package belajar.oop.`04_secondaryConstructor`

/**
 * NO PRIMARAY CONSTRUCTOR
 * Vape contoh class tanpa primary constructor
 * Tapi saran PZN tetap buat yang ada primary constructor supaya paramnya bisa di akses dalam class, kalau tidak ada PrimConst maka tidak bisa di akses langsung.
 */
class Vape {
    var type: String
    var ohm: Int = 5

    //
    constructor(typeParam: String) {    // sepertinya ini bisa dilakukan karena ohm memiliki nilai default
        type = typeParam
    }

    constructor(typeParam: String,
        ohmParam: Int,
    ):this(typeParam){ // ini opsional, bisa juga tidak panggil constructor yang lain.
        ohm = ohmParam
    }

    constructor(ohmParam: Int){
        ohm = ohmParam
        type = "Tidak Ada"
    }
    init {
        println("vape-init")
    }

}