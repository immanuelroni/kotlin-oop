package belajar.oop.O33_TypeAlias

// Typealias untuk lambda function sederhana
typealias OperasiMatematika = (Int, Int) -> Int

// Typealias untuk callback
typealias OnSuccess = () -> Unit
typealias OnError = (String) -> Unit


// alias digunakan dibagian param disini = operasi: OperasiMatematika
class Calculator {
    fun hitungOperasi(a: Int, b: Int, operasi: OperasiMatematika): Int {
        return operasi(a, b)
    }
}

fun main() {
    val calculator = Calculator()

    // Menggunakan lambda untuk penjumlahan
    val hasilTambah = calculator.hitungOperasi(5, 3) { x, y -> x + y }
    println("Hasil tambah: $hasilTambah")

    // Menggunakan lambda untuk perkalian
    val hasilKali = calculator.hitungOperasi(5, 3) { x, y -> x * y }
    println("Hasil kali: $hasilKali")

    // Contoh penggunaan callback
    val onSuccess: OnSuccess = { println("Operasi berhasil!") }
    val onError: OnError = { pesan -> println("Error: $pesan") }

    // Mensimulasikan operasi sukses
    onSuccess()
    // Mensimulasikan operasi error
    onError("Terjadi kesalahan")
}