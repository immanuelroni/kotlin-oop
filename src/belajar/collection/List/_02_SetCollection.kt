package belajar.collection.List

/**
 * Set pasti unik, jadi misal ada roni, roni, roni maka yang dianggap hanya ada 1 roni
 * Set, adalah collection yang datanya harus unik dan tidak pasti berurut
 * Saat kita memasukkan data duplicate ke Set, maka data hanya akan disimpan satu, data
 * duplicatenya tidak akan ditambahkan ke dalam Set
 * Set sangat cocok untuk menyimpan data yang emang unik, tidak boleh sama
 * Set menggunakan function hashCode() dan equals() untuk membandingkan apakah sebuah object
 * sama atau tidak, jika hashCode() dan equals() nya sama, maka diangkap data tersebut duplicate,
 * dan tidak akan diterima Oleh Set
 */

// gak bisa get index, karena urutanya acak

class Person(val name: String){
    override fun hashCode(): Int {
        return name.hashCode()
    }

    override fun equals(other: Any?): Boolean = when (other) {
        is Person -> name == other.name
        else -> false
    }

    override fun toString(): String {
        return "Nama orang: $name"
    }
}

fun main() {
    // immutable
    val set : Set<Person> = setOf(
        Person("A"),Person("B"),Person("B"),Person("C"),Person("D"),Person("E")
    )

    println("----- cetak imutable -----")
    println(set.size)
    println(set.contains(Person("B")))

    for(person in set){
        println(person)
    }

    // Mutable Set
    val setMutable : MutableSet<Person> = mutableSetOf(
        Person("1"),Person("2"),Person("3"),Person("4"),Person("5"),Person("6")
    )
    println("----- cetak mutable -----")
    setMutable.add(Person("100"))
    setMutable.add(Person("2"))

    for (person in setMutable){
        println(person)
    }


}
