package belajar.oop.O24_ExtensionFunction


/**
 *  ----- Extension Function -----
 *  Pada materi Kotlin Dasar kita sudah membahas tentang Extension Function, yaitu menambahkan
 * function pada tipe data yang sudah ada
 *
 *  ---- Catatan -----
 * Perlu diperhatikan, bahwa saat membuat extension function, kita tidak memodifikasi class aslinya
 * Extension function hanyalah sebuah function bantuan yang artinya, kita tidak bisa mengakses data
 * private atau protected dari class tersebut
 *
 * ----- Nullable -----
 * Secara standar, extension function hanva bisa untuk data yang tidak null
 * Jika kita ingin membuat extension function yang bisa digunakan untuk data yang bisa null, kita
 * perlu menggunakan kata kunci ? (tanda tanya)
 */

fun main() {
    val murid1 = Students("ROni",12)
//    murid1.sayHi("Budi") // parameter Studentsnya harus public


    // kalau mau bisa ada data null
    val murid2 = Students("Adi",10)
    murid2.sayHiNullable("X")

}




