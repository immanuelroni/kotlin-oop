package belajar.oop.`13_superConstructor`
/**
 * Super Constructor
 *  kata kunci super bisa dipake akses properties dan juga function dari parent
 *  selain itu kata kunci super juga bisa digunakan untuk mengkases constructor si Parent
 *  mengakses constructor class Parent hanya bisa dilakukan dalam constructor class Child.
 */
open class Customer(val name: String,val type: String, val balance: Long) {
    constructor(name:String,type: String):this(name,type,0)
    constructor(name:String):this(name,"Standart")
}


// ------------- PENTING --------------------------------------------
// kita buat tidak pakai primary constructor si PremiumCustomernya
// jadi tidak pakai class PremiumCustomer(): Customer(){}
// tapi langsung class PremiumCustomer: Customer(){}
// sebab kalau pakai primary constructor wajib dipanggil dan code dibawah akan error karena tidak memanggil primary constructor

class PremiumCustomer: Customer{
    constructor(name:String): super(name,"Premium")
    constructor(name:String, balance: Long): super(name,"Premium",balance)
}

// ini kalau mau akses pakai primary constructor
// tp dengan demikian kita tidak akan panggil super constructor karena ujungnya cmn panggil primary constructor
class ExecutiveCustomer(name:String,balance:Long):Customer(name,"Executive",balance){
    constructor(name:String):this(name,100)
}