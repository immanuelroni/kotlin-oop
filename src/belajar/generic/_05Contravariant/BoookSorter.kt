package belajar.generic._05Contravariant

// Hierarki kelas untuk media cetak
interface Printable {
    fun print()
}

// Kelas dasar untuk media cetak
open class Publication(val title: String, val pages: Int) : Printable {
    override fun print() {
        println("Mencetak publikasi: $title")
    }
}

// Subkelas untuk buku
class Book(title: String, pages: Int, val author: String) : Publication(title, pages)

// Subkelas untuk majalah
class Magazine(title: String, pages: Int, val issue: Int) : Publication(title, pages)

// Antarmuka dengan contra variant untuk membandingkan media cetak
interface Sorter<in T> {
    fun compare(a: T, b: T): Int
}

// Implementasi sorter untuk publikasi
class PublicationSorter : Sorter<Publication> {
    override fun compare(a: Publication, b: Publication): Int {
        return a.pages.compareTo(b.pages)
    }
}

// Implementasi sorter untuk buku
class BookSorter : Sorter<Book> {
    override fun compare(a: Book, b: Book): Int {
        return a.author.compareTo(b.author)
    }
}

fun main() {
    // Membuat objek-objek publikasi
    val book1 = Book("Pemrograman Kotlin", 300, "John Doe")
    val book2 = Book("Algoritma Lanjut", 250, "Jane Smith")
    val magazine1 = Magazine("Tech Weekly", 100, 1)
    val magazine2 = Magazine("Science Monthly", 80, 2)

    // Sorter publikasi umum
    val publicationSorter: Sorter<Publication> = PublicationSorter()

    // Menunjukkan contra variant
    // Bisa menggunakan sorter publikasi untuk membandingkan buku
    val bookSorter: Sorter<Book> = publicationSorter

    // bisa juga
    val bookSorter2: Sorter<Book> = BookSorter()

    // Demonstrasi perbandingan
    println("Perbandingan buku berdasarkan halaman: ${publicationSorter.compare(book1, book2)}")
    println("Perbandingan majalah berdasarkan halaman: ${publicationSorter.compare(magazine1, magazine2)}")

    // Contoh fleksibilitas contra variant
    println("Menggunakan sorter publikasi untuk membandingkan buku: ${bookSorter.compare(book1, book2)}")

    // coba2
    println("${bookSorter2.compare(book1,book2)}")
}