package belajar.generic._05Contravariant

// Contoh hierarki kelas
open class Animal
class Dog : Animal()
class Cat : Animal()

// Antarmuka dengan contra variant
interface Comparator<in T> {
    fun compare(a: T, b: T): Int
}

class AnimalComparator : Comparator<Animal> {
    override fun compare(a: Animal, b: Animal): Int {
        // Logika perbandingan sederhana
        return a.javaClass.simpleName.compareTo(b.javaClass.simpleName)
    }
}

fun main() {
    // Contoh penggunaan contra variant
    val animalComparator: Comparator<Animal> = AnimalComparator()

    // Kita bisa menggunakan komparator untuk Dog dan Cat
    val dogComparator: Comparator<Dog> = animalComparator
    val catComparator: Comparator<Cat> = animalComparator

    val dog1 = Dog()
    val dog2 = Dog()
    val cat1 = Cat()
    val cat2 = Cat()

    // Menggunakan komparator
    println("Perbandingan Dog: ${animalComparator.compare(dog1, dog2)}")
    println("Perbandingan Cat: ${animalComparator.compare(cat1, cat2)}")
    println("Perbandingan Cat dan Dog : ${animalComparator.compare(cat1, dog1)}")

    // Demonstrasi fleksibilitas contra variant
    println("Komparator Dog dapat digunakan untuk Animal: ${dogComparator.compare(dog1, dog2)}")
}