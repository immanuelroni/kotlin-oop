package belajar.generic._06GenericConstraints

// Antarmuka Comparable sudah ada di Kotlin standar, jadi kita tidak perlu mendefinisikannya lagi

// Kelas generic dengan batasan multiple
class DataProcessor<T : Comparable<T>> {
    // Fungsi untuk menemukan nilai maksimum
    fun findMax(list: List<T>): T {
        if (list.isEmpty()) {
            throw NoSuchElementException("List kosong")
        }

        return list.maxOrNull()
            ?: throw NoSuchElementException("Tidak ada elemen maksimum")
    }

    // Fungsi untuk mengurutkan list
    fun sortList(list: List<T>): List<T> {
        return list.sorted()
    }
}

// Kelas kustom yang mengimplementasikan Comparable
class Person(val name: String, val age: Int) : Comparable<Person> {
    override fun compareTo(other: Person): Int {
        return this.age.compareTo(other.age)
    }

    override fun toString(): String = "$name (Umur: $age)"
}

fun main() {
    // Penggunaan dengan tipe Integer
    val intProcessor = DataProcessor<Int>()
    val intList = listOf(5, 2, 8, 1, 9)
    println("Nilai Maks Integer: ${intProcessor.findMax(intList)}")
    println("List Integer Terurut: ${intProcessor.sortList(intList)}")

    // Penggunaan dengan kelas kustom Person
    val personProcessor = DataProcessor<Person>()
    val personList = listOf(
        Person("Alice", 30),
        Person("Bob", 25),
        Person("Charlie", 35)
    )
    println("Orang Tertua: ${personProcessor.findMax(personList)}")
    println("List Orang Terurut: ${personProcessor.sortList(personList)}")
}