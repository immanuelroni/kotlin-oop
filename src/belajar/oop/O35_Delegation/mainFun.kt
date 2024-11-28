package belajar.oop.O35_Delegation

/**
 * -----  Delegation -----
 * Salah satu design pattern lain yang populer adalah Delegation
 * Delegation sederhananya adalah meneruskan properties atau function ke object yang lain
 * Kotlin mendukung delegation tanpa harus membuat kode secara manual
 *
 */
fun main() {
    val base = MyBase()
    base.sayHi("Eko")

    // cara panggil delegation secara manual
    val baseDelegate = MyBaseDelegate(base)
    baseDelegate.sayHi("panggil") // jadi dia akan panggil base sebenarnya.


    // panggil yang simple tadi
    val delegation = Delegation(base)
    delegation.sayHi("Apa kabar?")

}