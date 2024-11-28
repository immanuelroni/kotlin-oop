package Function

/**
 * Selain properties dalam class kita juga bisa membuat function
 *
 */


// jadi ada kata kunci val di parameter constructornya
class Studesnts(val name: String){

    fun sayHi(pesan: String){
        println("$pesan")
    }

    fun kelas(): String{
        return "Kelas IPA"
    }
}

fun main() {
    var std1 = Studesnts(name = "Ratna")
    std1.sayHi("Saya akan lawan kamu!")
    println("${std1.kelas()}")
}