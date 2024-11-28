package belajar.oop.`13_superConstructor`
/**
 * Super Constructor
 *  kata kunci super bisa dipake akses properties dan juga function dari parent
 *  selain itu kata kunci super juga bisa digunakan untuk mengkases constructor si Parent
 *  mengakses constructor class Parent hanya bisa dilakukan dalam constructor class Child.
 */
fun main() {
    val premiumCustomer = PremiumCustomer("Roni")
    println(premiumCustomer.name)


    val executiveCustomer = ExecutiveCustomer("Ganis",100)
    println(executiveCustomer.name)
    println(executiveCustomer.balance)
}