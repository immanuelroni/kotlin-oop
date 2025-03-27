package belajar.generic._11ReadOnlyProperty

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

// Kelas khusus untuk konfigurasi koneksi database
class DatabaseConfig(
     val host: String,
     val port: Int
)

// Kelas khusus untuk validator koneksi database
class DatabaseConnectionValidator : ReadOnlyProperty<Any, DatabaseConfig> {
    // Contoh konfigurasi default
    private val defaultConfig = DatabaseConfig("localhost", 1432)

    // Metode validasi koneksi
    private fun validateConnection(config: DatabaseConfig): DatabaseConfig {
        println("do validate")
        require(config.host.isNotBlank()) { "Host tidak boleh kosong" }
        require(config.port in 1024..65535) { "Port tidak valid" }
        return config
    }

    override fun getValue(thisRef: Any, property: KProperty<*>): DatabaseConfig {
        println("get value dipanggil")
        return validateConnection(defaultConfig)
    }
}

// Kelas yang menggunakan delegasi properti database
class DatabaseManager {
    // Delegasi konfigurasi database dengan validasi
   private val configuration : DatabaseConfig by DatabaseConnectionValidator()

    // Metode contoh untuk membuat koneksi
    fun connect() {
        println("do connect")

        // jadi ketika configuration di akses maka getValue akan dijalankan.
        val config = configuration
        println("Connecting to ${config.host}:${config.port}")
        // Logic koneksi database aktual
    }
}

// Contoh penggunaan
fun main() {
    val dbManager = DatabaseManager()

    // Akan menggunakan konfigurasi default yang telah divalidasi
    dbManager.connect()
}