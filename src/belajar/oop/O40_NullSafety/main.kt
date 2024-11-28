package belajar.oop.O40_NullSafety

/**
 * ----- Null Safety -----
 * Jika teman-teman sebelumnya pernah belajar bahasa pemrograman Java, di Java kita sering
 * mengenal error bernama NullPointerException. Error ini terjadi ketika kita mengakses properties
 * atau functions di null object
 * Di Kotlin, hal ini sangat jarang terjadi, karena sejak awal di Kotlin tidak direkomendasikan untuk
 * menggunakan nullable type.
 * Walaupun akan menggunakan nullable type, di Kotlin kita memberitahu secara eksplisit
 * menggunakan karakter ? (tanda tanya)
 * Kali ini kita akan bahas cara-cara agar terhindar dari error null di Kotlin sehingga tidak sering
 * kejadian seperti di Java
 *
 *  ----- Elvis Style ------
 *   val name = teman?.name ?: "" // ini artinya jika teman.name adalah null maka set menjadi string kosong atau ""
 *
 *
 *   ----- !! Operator
 * ika kita sangat mencintai NullPointerException :D
 * Dan kita benar-benar yakin bahwa variabel tersebut tidak null
 * Maka kita bisa menggunakan kata kunci !! untuk mengkonversi dari data yang nullable menjadi
 * data tidak nullable
 * Tapi ingat, konsekuensinya, jika sampai ternyata datanya null, maka akan terjadi error
 */

fun main() {
//    val teman1 = Friend()
    val teman2 = Friend("teman2")
    sayElvis(teman2)

}
