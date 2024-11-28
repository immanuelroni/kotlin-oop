package belajar.oop.`04_secondaryConstructor`

/**
 * Kotlin mendukung lebih dari satu Constructor
 * Constructor yang utama yang terdapat di CLass, disebut Primary Constructor, Constructor tambahan yang bisa kita buat lagi adalah secondary constructor
 * Saat membuat constructor, kita wajib memanggil primary constructor jika ada primary constructornya.
 */


fun main() {
    val vapeOxva = Vape(typeParam = "Oxva 1",
        ohmParam = 10)
    val vapeJoyWay = Vape(
        typeParam = "Joy Way v1"
    )
    val vapeCaliburnv1 = Vape(typeParam = "Caliburn v1.0")
    val vapeAjaib = Vape(1)

    println("Vape: ${vapeOxva.type}, Ohm: ${vapeOxva.ohm} created")
    println("Vape: ${vapeJoyWay.type}, Ohm: ${vapeJoyWay.ohm} created")
    println("Vape: ${vapeCaliburnv1.type}, Ohm: ${vapeCaliburnv1.ohm} created")
    println("Vape: ${vapeAjaib.ohm}, ${vapeAjaib.type}")

}