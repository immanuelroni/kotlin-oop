package belajar.oop.O29_AnonymousClass

/**
 * ----- Anonymous Class -----
 * Saat kita ingin membuat object, maka kita diwajibkan untuk menggunakan deklarasi class yang lengkap
 * Namun, Kotlin mendukung pembuatan object dari class yang bahkan belum lengkap
 * Bahkan, di Kotlin, kisa bisa membuat object dari interface
 * Kemampuan ini dinamakan anonymous class
 * Untuk membuat anonymous class, kita bisa menggunakan kata kunci object diikuti dengan
 * deklarasi class Child seperti pada pewarisan
 */

fun fireAction(action: Action){
    action.act()
}

/* cara akses umumnya */
class SampleAction : Action{
    override fun act() {
        println("do action")
    }
}

fun main() {
     fireAction(SampleAction())

    // cara akses dengan anonymous class atau class tanpa nama
    fireAction(object : Action{
        override fun act() {
            println("do anon act")
        }
    })

    // cara yang lain, masih sama aja
    fireAction(action = object : Action{
        override fun act() = println("do anon act 2")
    })
}