package belajar.generic._07TypeProjection

/**
 * Type Projection
 * Kadang agak sulit untuk membuat class generic type yang harus covariant atau contravariant,
 * misal karena memang di class generic tersebut terdapat input dan output generic parameter type
 * Namun jika kita membuat function untuk memanipulasi data invariant sangat lah sulit, karena generic parameter type nya harus selalu sama
 * Kita bisa melakukan type projection, yaitu menambahkan informasi covariant atau contravariant
 * di parameter function, ini memaksa isi function untuk melakukan pengecekan
 * Jika covariant, kita tidak boleh mengubah data generic di object
 * Jika contravariant, kita tidak boleh ngambil data generic object
 */

class Container<T>(var data: T)

/**
 * Ini kita memaksa paramnya menjadi covaraint dan contra variant
 */

// dengan generic constraints
fun CopyData(from : Container<out Any>, to : Container<in Any>){
    to.data = from.data
}

fun main() {
    // pakai covariant, induknya dari anak
    val cont1 : Container<String> = Container("Satu")

    // ini penting Container<Any> untuk memastikan cont2 adalah dari Any
    // pakai contra variant, anaknya dari induk
    // cuma di case ini Stringnya di instansiasi dari Container Any ke Any jd se level
    val cont2 : Container <Any> = Container("Dua")

    CopyData(cont1,cont2)
    println(cont1.data)
    println(cont2.data)
}