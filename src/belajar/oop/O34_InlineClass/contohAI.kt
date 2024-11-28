package belajar.oop.O34_InlineClass


// contoh dari AI
@JvmInline
value class Rupiah(val nilai: Double) {
    operator fun plus(other: Rupiah): Rupiah {
        return Rupiah(nilai + other.nilai)
    }

    fun format(): String {
        return "Rp %.2f".format(nilai)
    }
}

fun hitungTotal(harga: Rupiah, jumlah: Int): Rupiah {
    return Rupiah(harga.nilai * jumlah)
}

fun main() {
    val hargaBarang = Rupiah(15000.0)
    val jumlah = 3

    val total = hitungTotal(hargaBarang, jumlah)
    println("Total: ${total.format()}")

    // Contoh penggunaan operator
    val harga1 = Rupiah(10000.0)
    val harga2 = Rupiah(5000.0)
    val totalHarga = harga1 + harga2
    println("Total harga: ${totalHarga.format()}")
}