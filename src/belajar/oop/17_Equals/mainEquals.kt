package belajar.oop.`17_Equals`

/**
 * Di Kotlin, semua objek bisa dibandingkan menggunakan operasi == atau !=
 * Saat kita membandingkan objek menggunakan operasi == atau !=, sebenarnya Kotlin akan
 * menggunakan function equals milik class Any
 * Untuk mengubah cara membandingkannya, kita bisa meng-override function equals milik class Any
 */


fun main() {

    val company1 = Company("PT A")
    val company2 = Company("PT A")

    // false karena sekalipun Stringnya sama, mereka 2 objek yang berbeda
    // namun karena saya overriding jadi true, karena saya buat syarat tambahan agar ketika namanya sama, akan true.
    val isSame = company1.equals(company2)

    val isSame2 = company1.equals(company1)
    println(isSame)
    println(isSame2)

}