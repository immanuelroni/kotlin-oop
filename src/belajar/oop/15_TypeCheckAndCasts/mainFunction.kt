package belajar.oop.`15_TypeCheckAndCasts`

import belajar.oop.`14_AnyClass`.Laptop
import belajar.oop.`14_AnyClass`.Oxva

/**
 * Dalam OOP kita akan sering menggunakan class dan pewarisan
 * kadang kita perlu megecek tipe data dan melakukan konversi
 * -------- is dan !is adalah checker untuk mengecek apakah any adalah salah satu child dari class tertentu.
 * -------- Smart Cast
 * Kotlin memiliki konversi data secara otomatis setelah kita melakukan pengecekan
 * Setelah kita melakukan pengecekkan is, maka otomatis tipe data yang kita cek akan berubah menjadi tipe data yang kita cek tadi.
 * -------- Unsafe Cast
 * Kotlin juga bisa memaksa konversi tipe data menggunakan kata kunci as
 * Namun konversi menggunakan as sangat tidak aman karena jika ternyata tipe datanya tidak sesuai akan error
 * Namun ada solusi lebih aman dengan menggunakan cast? jadi jika gagal konversi akan jadi null.
 */

fun main() {

    fun printObject(any : Any){
        //------- is dijalankan
        // untuk cek apakah dia bagian dari class tertentu lalu dengan is
        if (any is Laptop){
            //smart cast
            // hanya bisa di akses ketika any is dijalankan
            println("Laptop ${any.nama}")
        }else if( any is Oxva){
            // smart cast
            println("Vape ${any.nama} ${any.type}")
        }else{
            println(any)
        }
    }

    fun printObjectWithWhen(any: Any){
        // dengan cara when if, lebih mudah dibaca
        when (any) {
            is Laptop -> {
                //smart cast
                // hanya bisa di akses ketika any is dijalankan
                println("Laptop ${any.nama}")
            }

            is Oxva -> {
                // smart cast
                println("Vape ${any.nama} ${any.type}")
            }

            else -> println(any)
        }
    }
    // UNSAFE CAST
    fun printAsString(any: Any){
        // Unsafe Cast
        val nilai: String = any as String
        println(nilai)
    }

    fun printAsSafeCast(any: Any){
        val nilai : String? = any as? String
        println(nilai)
    }

    printObject("Apapun")
    printObject(Laptop("Zyrex")) // semua bisa diprint
    printObject(Oxva("Oxla Go","Pod Catridge","Pod"))
    printObjectWithWhen(Oxva("Oxla Go","Pod Catridge","Pod"))
    printAsString("Paksa")
    printAsSafeCast(1)    // ini akan error.
}