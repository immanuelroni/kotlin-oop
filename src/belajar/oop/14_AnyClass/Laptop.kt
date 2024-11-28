package belajar.oop.`14_AnyClass`

class Laptop(val nama: String) { // gak perlu : Any karena harus pake constructor
}

open class Vape(val nama: String) // ini akan extends dari Any
class Oxva(val namaParam: String, val catridge:String, val type: String) : Vape(namaParam){} // ini akan child dari Vape