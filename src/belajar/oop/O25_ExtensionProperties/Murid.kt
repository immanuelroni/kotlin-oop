package belajar.oop.O25_ExtensionProperties



class Murid(val name : String, private val age: Int)

// extension function.
fun Murid.sayHi(name: String){
    // ini error karena age adalah private. ubah jadi public agar bisa diakses.
//    println("Hai, $name saya adalah ${this.name}, umur saya ${this.age}")
}

//nullable extension function
fun Murid?.sayHiNullable(name: String){
    if(this != null) {
        // ketika udah cek tidak sama dengan bull dia gak perlu $name?
        // ini error karena age adalah private. ubah jadi public agar bisa diakses.
        println("Hai, $name saya adalah ${this.name}")
    }
}

// extension properties
val Murid.uppername : String
    get() = this.name.uppercase()