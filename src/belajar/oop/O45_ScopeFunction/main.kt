package belajar.oop.O45_ScopeFunction

import belajar.oop.O24_ExtensionFunction.Students
import belajar.oop.O24_ExtensionFunction.sayHiNullable

/**
 * Scope Function
 * Kotlin memiliki standar library yang berisikan beberapa function yang bisa digunakan untuk mengeksekusi object dengan mudah memanfaatkan lambda expression
 * Function-function tersebut adalah let, run, with, apply, dan also
 */

/**
 * Let Function
 * Let function bisa digunakan sebagai reference block agar kita bisa lebih mudah ketika ingin
 * memanipulasi sebuah object
 * Let function memiliki parameter object itu sendiri, sehingga kita bisa menggunakan kata kunci it
 * untuk mendapatkan referensi terhadap object tersebut
 */

fun main() {
    val student = Students("Roni", 28)
    println("Let Fun")

    //------------------------------ Akses Scope ------------------------
    // cara akses scope
    val data = student.let {
        println(it.name)
//        println(it.age)// ini tidak bisa karena propetiesnya private
        println(it.sayHiNullable("data"))
        // cuma sebenarnya dia ada return value, jd misal tak kasih String bakal di return
        "ini akan return"
    }
    println(data)
    //-------------------------------------------------------------------

    /** Run Function
     * Run function mirip dengan let function
     * Yang membedakan adalah, pada run function, tidak ada parameter pada lambda nya, sehingga kita
     * tidak bisa mengakses reference object menggunakan kata kunci it. Namun kita masih bisa
     * menggunakan kata kunci this
     * Mirip sebelumnya tapi aksesnya via this.
     * Return Functionya akan berupa String
     */
    println("----------------------------")
    println("Run Fun")
    val hasil2 = student.run {
        "Nama: ${this.name}"
    }
    println(hasil2)
    println("------------------------------")
    println("Apply Fun")

    /**
     * Apply Function
     * Apply function hampir sama dengan run function
     * Yang membedakan adalah return value dari apply function ada reference object itu sendiri
     */
    val hasil3 : Students = student.apply {
        "Nama: ${this.name}" // melakukan hal apapun disini tidak akan mempengaruhi return
    }
    println(hasil3)
    println("------------------------------")

    /**
     * Also Fun
     * Also function mirip dengan let function
     * Yang membedakan adalah, pada also function, return value nya adalah reference ke object itu
     * sendiri
     */
    println("also")
    // returnnya akan class object tsb
    val data2 : Students = student.also {
        println(it.name)
//        println(it.age)// ini tidak bisa karena propetiesnya private
        println(it.sayHiNullable("data"))
        // cuma sebenarnya dia ada return value, jd misal tak kasih String bakal di return
        "Nama: ${it.name}" // ini akan return sebagai kotlin unit.
    }
    println(data2)
    println("--------------------------------")
    /**
     * With Function
     * With function mirip dengan run function, menggunakan reference this
     * Yang membedakan adalah, with function bukanlah extension function, jadi tidak bisa digunakan langsung dari object-nya
     * Kita harus memanggil with function secara manual
     */
    println("With Function:")
    // kembaliannya akan sesuai lambda yang kita lempar, dari kasus ini saya lempar fun sayHiNullable()
    val data3 : Students = Students("Aji",10)
    with(data3){
        println(this.name)
        this.sayHiNullable("say apapun")
    }






}