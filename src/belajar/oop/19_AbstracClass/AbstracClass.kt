package belajar.oop.`19_AbstracClass`

/**     ABSTRAC CLASS
 * Saat kita membuat class, kita bisa menjadikan sebuah class sebagai abstract
 * Abstract class artinya, class tersebut tidak bisa dibuat sebagai object, hanya bisa diturunkan
 */


abstract class Location(val nama : String)

class City(nama: String) : Location(nama)   //


fun main() {
    // ini akan error karena mencoba membuat instance dari sebuah abstrac class
    // abstrac class akan secara default open class
    // val lokasi = Location("Yogyakarta")
    val city = City("Bandung")

    println(city.nama)
}