package belajar.oop.O42_Annotation

/**
 * ------ Annotation -----
 * Annotation adalah menambahkan metadata ke kode program yang kita buat
 * Tidak semua orang membutuhkan Annotation, biasanya Annotation digunakan saat kita ingin membuat library / framework
 * Annotation sendiri bisa diakses menggunakan Reflection, yang akan kita bahas nanti
 * Untuk membuat class annotation, kita bisa menggunakan kata kunci annotation sebelum membuat class tersebut
 * Annotation hanya boleh memiliki properties via primary constructor, tidak boleh memiliki members lainnya (function atau properties di body)
 *
 *
 * ----- Atribut yang bisa digunakan -----
 * Attribute
 * @Target
 *  * Memberitahu annotation bisa digunakan di mana? Class,
 *  * function, properties, dan lain-lain
 * @Retention
 *  * Memberitahu annotation apakah disimpan di hasil kompilasi,
 *  * dan apakah bisa dibaca Oleh reflection?
 * @Repeatable
 *  * Memberitahu annotation apakah bisa digunakan lebih dari
 *  * sekali di target yang sama?
 * @MustBeDocumented
 *  * Memberitahu annotation apakah perlu didokumentasikan di
 *  * public API
 */
@Fancy(pembuat = "Roni")
class MyApp(val name: String, val version : String){
    fun info() : String = "Apps $name $version"
}

fun main() {
    val app1 = MyApp("App saya","version 2")
    println(app1.info())
    // ya hasilnya sama aja, annotation tidak dipake apa2 karena kita tidak pake framwork. jd blm butuh kalau native kotlin
}

