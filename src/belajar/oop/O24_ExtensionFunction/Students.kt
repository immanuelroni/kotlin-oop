package belajar.oop.O24_ExtensionFunction

class Students(val name : String, private val age: Int)

// extension function.
fun Students.sayHi(name: String){
    // ini error karena age adalah private. ubah jadi public agar bisa diakses.
//    println("Hai, $name saya adalah ${this.name}, umur saya ${this.age}")
}

//nullable extension function
fun Students?.sayHiNullable(name: String){
    if(this != null) {
        // ketika udah cek tidak sama dengan bull dia gak perlu $name?
        // ini error karena age adalah private. ubah jadi public agar bisa diakses.
        println("Hai, $name saya adalah ${this.name}")
    }
}

