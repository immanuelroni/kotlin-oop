package belajar.oop.O41_Exception

/**
 * ------ Exception -----
 * Saat membuat program, kita pasti akan selalu berhadapan dengan error
 * Banyak sekali jenis error, baik itu error yang sudah diduga, seperti validation error, atau error yang tidak terduga, seperti ada jaringan error, koneksi ke database error, dan lain-lain
 * Error di Kotlin direpresentasikan dengan Exception, dimana semua tipe data error pasti akan selalu class turunan dari Throwable
 * Untuk membuat error di Kotlin sangatlah mudah, kita bisa menggunakan kata kunci throw, diikuti dengan object error nya
 *
 * ------ Try Catch -----
 * kamu tahu lah apa itu, jd biar misal kena throw program tetap berjalan.
 *
 * ----- Multiple Catch -----
 * Saat kita mengeksekusi sebuah kode program di blok Try, bisa dimungkinan tidak hanya terjadi
 * satu jenis exception, bisa saja terjadi beberapa jenis exception
 * Di Kotlin, kita bisa menggunakan multiple block Catch, untuk menangkap jenis exception yang berbeda
 *
 * ----- Finlay -----
 * Finally adalah block kode yang bisa ditambahkan di Try Catch
 * Block finally akan selalu dieksekusi setelah kode program Try Catch di eksekusi, baik itu sukses ataupun gagal
 * Ini cocok untuk menempatkan kode yang memang harus dilakukan tidak peduli baik itu kodenya sukses atau gagal
 *
 */
fun main() {
    // uncomment untuk test.
    // validateAndSay("") // ini akan di Throw ke validasi throw ValidationException("Name is Blank")
    // validateAndSay("aman tidak akan kena exception")

    try {
        validateAndSay("aman tidak akan kena exception")
        validateAndSay("")
        validateAndSay("aman tidak akan kena exception") // ini akan di skip
    }catch (pesanError : ValidationException){
        println("terjadi error ${pesanError.message}")  // ini akan kena exception namun program tetap berjalan.
    }catch (errorLain : Throwable){
        println("Error: $errorLain")
    }finally {
        println("ini akan selalu di eksekusi")
    }
}