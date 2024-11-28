package belajar.oop.`20_Getter&Setter`

/**
 * Di bahasa pemrograman Java, ada sebuah konsep yang bernama Getter dan Setter saat membuat properties
 * Getter adalah function yang dibuat untuk mengambil data properties
 * Setter ada function untuk mengubah data propertie
 * Di kotlin, kita tidak perlu manual untuk membuat function Getter dan Setter nya, karena sudah difasilitasi sehingga lebih mudah
 *
 * Getter Setter di Kotlin lebih simple, dan jauh berbeda syntaxnya.
 *
 * Getter dan setter tidak wajib dideklarasikan
 */


fun main() {
    val note1 = Note("Belajar Kotlin")

    println(note1.title) // cara akses getter setter tinggal pakai . tak perlu pake get()
    note1.title = "Belajar Coding Kotlin"
    println(note1.title)

    // coba sendiri dengan cara getter, manipulasi properties Uppercase
    val upNote = UpperCaseNOte("Judul UpperCase")
    println(upNote.UpTitle)
}