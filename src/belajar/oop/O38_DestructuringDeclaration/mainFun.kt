package belajar.oop.O38_DestructuringDeclaration

import kotlin.math.log

/**
 *  ----- Destructuring Declaration -----
 * Destructuring declaration adalah membuat multiple variables dari sebuah object
 * Destructuring tidak bisa dilakukan untuk semua object, hanya objek yang memiliki function
 * componentX() yang bisa dilakukan destructuring
 * Saat kita membuat data class, secara otomatis akan dibuatkan function componentX() sesuai
 * dengan jumlah parameter nya
 */

/**
 * ----- Destructuring di Function -----
 * Destructuring declarations juga bisa dilakukan ketika memanggil function
 * Dengan ini, seakan-akan kita bisa mengembalikan multiple return value pada function
 *
 */



fun main() {
    val game = Game("Zelda",200000)

    // cara akses normal, kl banyak akan lama dan bikin repot
    // dengan destructuring akan lebih cepat
    // tambahkan kata kunci data di depan class nya
    println(game.name)
    println(game.price)

    // akses destructring atau membuat variable dari sebuah objek yang sudah ada
    val (name,price) = game
    println(name)
    println(price)

    //  Desrtucturing Funtion
    //    val hasil = minMax(10,100)
    //    val min = hasil.min
    //    val max = hasil.max
    // dapat dipersingkat dengan
    val (min,max) = minMax(10,100)
    println("min: $min")
    println("max: $max")

    /**
     * gunakan val (min,_) = minMax(10,100)
     * saat salah satu tidak dibutuhkan, jadi _ untuk tanda yang tidak kita butuhkan
     * lalu tinggal println(min)
     */

//    val (min,_) = minMax(10,100)
//    println("min saja: $min")

    /**
     * ----- Destructuring Lambda Parameter -----
     *  Destructuring juga bisa dilakukan di lambda parameter
     * Hal ini bisa mempermudah kita saat ingin mengakses data yang ada di parameter
     */
    // cara biasanya
//    val login = Login("Roni","pass12345")
//    login(login){login ->
//        login.username == "Roni" && login.pass == "pass12345"
//    }

    // cara destructuring
    val login = Login("Roni","pass12345")
    val bool = login(login){(uname,pass)->
        uname == "Roni" && pass == "pass12345"
    }
    println(bool)
}