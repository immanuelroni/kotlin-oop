package belajar.oop.O30_EnumClass


/**
 * ----- Enum Class -----
 * Enum class merupakan representasi dari class yang sudah tetap nilainya
 * Biasanya enum class digunakan untuk jenis data yang sudah baku, seperti jenis kelamin, arah mata
 * angin dan sejenisnya
 * Untuk membuat enum class, kita bisa menggunakan kata kunci enum sebelum deklarasi class nya
 * Kita tidak bisa membuat object dari class enum, namun kita bisa mendeklarasikan langsung object
 * yang tersedia untuk enum class tersebut
 */

/**
 * ----- Properties dan Function -----
 * Enum class adalah class seperti biasa pada umumnya
 * Enum class bisa memiliki properties ataupun function
 * Namun jika properties nya di set menggunakan constructors, maka saat pembuatan object enum,
 * wajib diisi, dan jika terdapat abstract function, wajib di override pada saat pembuatan object enum
 */
fun main() {

    val man = Gender.MALE
    val woman = Gender.FEMALE

    // cara get semua data enum
    val allGenders: Array<Gender> = Gender.values()

    println(man)
    println(woman)
    println(allGenders.toList())


    // cara akses yang ada properties dan function

    val kotak = Bentuk.KOTAK
    println(kotak.keterangan)

    val bulat = Bentuk.BULAT
    bulat.cetakBentuk()

}