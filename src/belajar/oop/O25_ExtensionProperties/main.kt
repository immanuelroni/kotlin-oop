package belajar.oop.O25_ExtensionProperties



/**
 * ----- Extension Properties
 *  Selain function, kita juga bisa membuat extension untuk properties di Kotlin
 *  Untuk membuat extension properties, kita bisa membuat properties dengan Getter atau Setter
 */


fun main() {
    val murid2 : Murid?= Murid("Adi",10) // muridnya bisa null jadi pas akses kasih namaObjek?
    println(murid2?.uppername)
}