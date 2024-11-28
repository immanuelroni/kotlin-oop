package belajar.oop.O34_InlineClass

// Deklarasi inline class menggunakan @JvmInline
@JvmInline
value class Email(val value: String) {
    // Bisa menambahkan validasi
    init {
        require(value.contains("@")) { "Email harus mengandung karakter @" }
    }

    // Bisa menambahkan fungsi
    fun getDomain(): String {
        return value.substringAfter("@")
    }
}

@JvmInline
value class Usia(val value: Int) {
    init {
        require(value >= 0) { "Usia tidak boleh negatif" }
    }

    fun isDeawasa(): Boolean {
        return value >= 17
    }
}

// Contoh penggunaan
class User(
    val email: Email,
    val usia: Usia
)

fun main() {
    // Membuat objek dengan inline class
    try {
        val email = Email("john.doe@gmail.com")
        val usia = Usia(25)

        val user = User(email, usia)

        println("Email: ${user.email.value}")
        println("Domain email: ${user.email.getDomain()}")
        println("Usia: ${user.usia.value}")
        println("Apakah dewasa? ${user.usia.isDeawasa()}")

        // Ini akan error karena validasi
        // val invalidEmail = Email("invalid-email")
        // val invalidUsia = Usia(-5)

    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }
}