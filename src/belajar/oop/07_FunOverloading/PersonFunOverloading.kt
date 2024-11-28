package belajar.oop.`07_FunOverloading`

/**
 * Fun Overloading
 *
 * Adalah sebuah kemampuan membuat fun dengan nama yang sama dalam class tersebut
 * Untuk membuat fun dengan nama sama, kita wajib menggunkan param yang berbeda, bisa tipe parameter yang berbeda,atau jumlah param yang berbeda.
 * param dengan tipe data yang berbeda dengan jumlah param yang sama itu bisa
 */

class Person {
    /**
     * Class terdiri dari properties dan fun
     */

    // PROPERTIES
    // jangan pakai val ya, karena tidak bisa di ubah nantinya
    var firstName: String = ""
    var middleName: String? = null
    var lastName:String = ""

    fun sayHi(pesan: String):Unit{ // retur Unit
        println("$pesan")
    }

//    fun sayHi(pesan: String):String{  // ini juga tidak bisa, sekalipun pengembaliannya berbeda, namun paramnya tetap sama hitungannya
//        println("$pesan")
//    }

    // beda tipe data param gini juga bisa
    fun sayHi(jumlah: Int){
        println("jumlah: $jumlah")
    }

    // overloading fun, yaitu fun dengan nama yang sama, namun beda paramnya
    // return valuenya juga harus sama Unit ya semua harus Unit

    fun sayHi(pesan: String,jawaban: String ): Unit{
        println("$pesan, $jawaban")
    }

    fun sayHi(pesan: String,jawaban: String,sapaan:String ): Unit{
        println("Hi, $sapaan $pesan, $jawaban")
    }
}

fun main() {
    val roni = Person()
    roni.sayHi("Hi ini fun cetak pesan")
    roni.sayHi(1)
    roni.sayHi("pesan", "jawaban")
    roni.sayHi("pesan","jawaban","sapaan")
}