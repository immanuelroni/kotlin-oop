package belajar.oop.O31_SingletonObject


/**
 * ----- Singleton Objetc -----
 * Salah satu konsep Design Pattern yang sangat populer adalah singleton object
 * Singleton object adalah Object yang hanya dibuat satu kali
 * Di Kotlin, membuat object singleton sangat mudah, hanya dengan menggunakan kata kunci object
 * Cara membuat singleton object di Kotlin sama seperti membuat class
 * Singleton object mirip dengan class, bisa extends class ataupun interface
 * Namun singleton object tidak memiliki constructors
 *
 * ----- penggunaan -----
 * biasanya digunakan untuk utility class
 *
 *
 * ----- Inner Object -----
 * Di Kotlin, singleton object bisa dibuat di dalam sebuah class
 * Namun berbeda dengan inner class, singleton object tidak bisa mengakses properties atau
 * function yang ada di outer class nya
 */
fun main() {
    println(Utilities.name)
    println(Utilities.toUpper("Capital"))
// jadi name tidak bisa diganti2 dia akan selalu 1 instance saja.


    println(Application.Util.goUpper("Test Upper"))

}