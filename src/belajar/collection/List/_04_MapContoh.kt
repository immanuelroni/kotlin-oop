package belajar.collection.List

// Class untuk merepresentasikan sebuah buku
class Buku(val judul: String, val pengarang: String, val tahunTerbit: Int) {
    override fun toString(): String {
        return "$judul (oleh $pengarang, $tahunTerbit)"
    }
}

// Class Perpustakaan yang mengelola inventaris buku
class Perpustakaan {
    // Menggunakan MutableMap untuk menyimpan inventaris buku
    private val inventaris: MutableMap<String, MutableList<Buku>> = mutableMapOf()

    // Menambahkan buku ke dalam inventaris
    fun tambahBuku(kategori: String, buku: Buku) {
        // Jika kategori belum ada, buat list baru
        if (!inventaris.containsKey(kategori)) {
            inventaris[kategori] = mutableListOf()
        }

        // Tambahkan buku ke kategori yang sesuai
        inventaris[kategori]?.add(buku)
    }

    // Menghapus buku dari inventaris
    fun hapusBuku(kategori: String, buku: Buku): Boolean {
        return inventaris[kategori]?.remove(buku) ?: false
    }

    // Mendapatkan daftar buku dalam suatu kategori
    fun dapatkanBukuDalamKategori(kategori: String): List<Buku> {
        return inventaris[kategori] ?: emptyList()
    }

    // Menampilkan seluruh inventaris
    fun tampilkanInventaris() {
        println("Inventaris Perpustakaan:")
        for ((kategori, daftarBuku) in inventaris) {
            println("\nKategori: $kategori")
            daftarBuku.forEachIndexed { index, buku ->
                println("${index + 1}. $buku")
            }
        }
    }
}

// Fungsi main untuk mendemonstrasikan penggunaan
fun main() {
    val perpustakaan = Perpustakaan()

    // Membuat beberapa buku
    val buku1 = Buku("Laskar Pelangi", "Andrea Hirata", 2005)
    val buku2 = Buku("Sang Pemimpi", "Andrea Hirata", 2006)
    val buku3 = Buku("Atomic Habits", "James Clear", 2018)
    val buku4 = Buku("Clean Code", "Robert Martin", 2008)

    // Menambahkan buku ke dalam inventaris dengan kategori berbeda
    perpustakaan.tambahBuku("Fiksi", buku1)
    perpustakaan.tambahBuku("Fiksi", buku2)
    perpustakaan.tambahBuku("Self-Improvement", buku3)
    perpustakaan.tambahBuku("Pemrograman", buku4)

    // Menampilkan inventaris
    perpustakaan.tampilkanInventaris()

    // Menghapus sebuah buku
    println("\nMenghapus buku: $buku2")
    perpustakaan.hapusBuku("Fiksi", buku2)

    // Menampilkan inventaris setelah penghapusan
    perpustakaan.tampilkanInventaris()

    // Mendapatkan buku dalam kategori tertentu
    val bukuFiksi = perpustakaan.dapatkanBukuDalamKategori("Fiksi")
    println("\nBuku dalam kategori Fiksi:")
    bukuFiksi.forEach { println(it) }
}