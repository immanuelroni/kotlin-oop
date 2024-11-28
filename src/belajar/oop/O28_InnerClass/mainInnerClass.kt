package belajar.oop.O28_InnerClass

/**
 * ----- Inner Class -----
 * Di Kotlin, kita bisa membuat class (Inner) di dalam class (Outer)
 * Namun walaupun class Inner tersebut berada di dalam class Outer, namun class Inner tidak bisa
 * mengakses data yang ada di dalam class Outer
 * Agar class Inner bisa mengakses data yang ada di dalam class Outer, kita bisa menggunakan kata kunci inner
 */


fun main() {

    /* membuat class inner, kita tidak bisa langsung membuat employe dengan cara
    *  val employee = Boss.Employee("Pashya")
    *
    * kita harus membuat bos dulu baru bisa buat innernya.
    *
    */

    // val employee = Boss.Employee("Pashya") // ini akan error

    val roni = Boss("Roni")
    val herta = Boss("Herta")
    //
    val pegawwai1 = roni.Employee("Pashya")
    val pegawai2 = herta.Employee("Ganish")
    pegawwai1.hi()
    pegawai2.hi()

}