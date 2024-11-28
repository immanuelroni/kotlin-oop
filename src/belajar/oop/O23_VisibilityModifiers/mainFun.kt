package belajar.oop.O23_VisibilityModifiers

/**
 * ----- Visibility Modifiers ------
 * Class, Interface, Constructor, Function, dan Properties (termasuk Getter dan Setter) bisa memiliki Visibility Modifiers di Kotlin
 * Ada 4 visibility modifiers di kotlin, yaitu: public, private, protected, internal
 * Secara standar visibility modifiers di kotlin adalah public
 * Jadi mirip java, pengaturan aksesibilitas
 *
 * ----- Keterangan -----
 *  public
 * Jika tidak menyebutkan, maka secara otomatis visibility modifiers nya adalah public, yang artinya bisa diakses dari manapun
 *
 * private
 * Artinya hanya bisa diakses di tempat deklarasinya
 *
 * protected
 * Artinya hanya bisa diakses di tempat deklarasi, dan juga turunannya
 *
 * internal
 * Artinya hanya bisa diakses di module/project yang sama.
 */

open class Teacher(val name: String) {
    private fun teach(){    // hanya bisa di akses dari class teacher
        println("Mengajar")
    }
    open protected  fun reading(){
        println("Reading")
    }
    internal fun calculating(){
        println("Calculating")
    }
}

class MathTeacher(name: String) : Teacher(name){
    // kita buat public agar bisa di akses di main
    override public fun reading(){
        super.reading()
    }
}

fun main() {
    val teacher = Teacher("Abi")
//    teacher.teach() // ini akan error, karena private.
//    teacher.reding() // ini akan error, karena protected
    teacher.calculating() // ini bisa diakses karena masih dalam mudule project yang sama

    // Cara akses protected yaitu via childnya.
    val mathTeacher = MathTeacher("Joni")
    mathTeacher.reading()
}