package belajar.oop.O32_CompanionObject

/**
 * ----- Companion Object -----
 * Companion object adalah kemampuan membuat inner object di dalam class, tanpa harus menggunakan nama object
 * Companion object secara otomatis akan menggunakan nama Companion, atau bisa langsung diakses lewat nama class nya
 */

fun main() {
    Application.hello("Eko") // cara pakai companion


    // sebenarnya kotlin secara tidak langsung memanggil seperti ini.
    // biar mudah seperti yang atas aja cara panggilnya.
    Application.Companion.hello("Roni")
    // dengan cara singleton
}
