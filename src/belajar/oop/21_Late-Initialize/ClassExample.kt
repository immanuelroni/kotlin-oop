package belajar.oop.`21_Late-Initialize`

class Television {
    lateinit var brand : String // seharusnya ada datanya di awal, tp dengan late init bisa dibuat tidak ada dulu.

    fun initTelevision(brand : String){
        this.brand = brand
    }
}