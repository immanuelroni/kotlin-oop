package belajar.oop.O44_Reflection

/**
 * ----- Reflection -----
 * Reflection adalah kemampuan melihat struktur aplikasi kita pada saat berjalan
 * Reflection biasanya sangat berguna saat kita ingin membuat library ataupun framework, sehingga
 * bisa meng-otomatisasi pekerjaan
 * Untuk mengakses reflection class dari sebuah object, kita bisa menggunakan kata kunci ::class,
 * atau bisa langsung dari NamaClass::class
 *
 *
 * --- Jadi ini contoh misal kita ingin membuat validasi class prodcut request, createProdcutRequset adalah class untuk buat objek product
 */
fun main() {
    val productRequest = createProductRequest("1", "Laptop", 1000000L)
    val categoryRequest = CreateCategoryRequest("1", "Elektronik")

    try {
        validateRequest(productRequest)
//        validateRequest(categoryRequest)
        println("Validasi berhasil")
    } catch (e: IllegalArgumentException) {
        println("Validasi gagal: ${e.message}")
    }

    // Contoh yang akan menghasilkan error
    try {
        val invalidProductRequest = createProductRequest("a", "", 1000000L)
        validateRequest(invalidProductRequest)
    } catch (e: IllegalArgumentException) {
        println("Validasi gagal: ${e.message}")
    }
}