package belajar.oop.`22_Interface`

/**
 *  INTERFACE
 * Di kotlin, deklarasi type tidak hanya dalam bentuk class, ada juga interface
 * Interface adalah blueprint, prototype atau cetakan di Kotlin
 * Berbeda dengan Class, Interface tidak bisa langsung dibuat sebagai Object
 * Interface hanya bisa diturunkan, dan biasanya Interface digunakan sebagai kontrak untuk class-class turunannya
 * Secara standar, semua properties dan function di Interface adalah abstract
 */

/** 01. Function di Interface
 * Function di Interface memiliki pengecualian, tidak harus abstract
 * Kita bisa membuat concrete function di Interface, artinya function tersebut tidak wajib untuk
 * dibuat ulang di child Class nya
 */

/** 02. Parent Intreface
 *  Multiple Inherintance - jadi child bisa inheritance dari beberapa interface.
 *  Mirip sugar daddy, bisa banyak parent
 *  Jadi child interface bisa punya banyak parent interface.
 */

/**
 * 03. Inheritance Interface
 * Tidak hanya Class yang punya kemampuan Inheritance
 * Interface juga bisa melakukan Inheritance dengan Interface lain
 * Namun Interface tidak bisa melakukan Inheritance dengan Class
 */


/**
 * 04. Konflik di interface
 * Terjadi saat melakukan inheritance dua interface berbeda namun nama methodnya sama
 * Cara aksesnya berbeda dan perlu berhati-hati karena bisa tertukar
 * Pastikan gunakan super<namaInterface>.namaMethodnya()
 * Di class main fun, Ctrl + Click method untuk memastikan mengakses method yang benar.
 *
 */

fun main() {
    val human1 = Human("Roni")
    human1.sayHello("")
    human1.sayEmoji("Love")

    //02. Parent Intreface
    val dog = Animal("Ciko")
    dog.sayHello("Gug!")
    dog.go()
    dog.sayEmoji("Waufff")

    //03. Inheritance Interface
    val person = Person("Roni")
    person.sayEmoji("LOVE")
    person.chatting()
    person.sayHello("Dyta!")

    val  person2 = Person2("Yanto")
    person2.sayEmoji("Anger")
    person2.move()

}