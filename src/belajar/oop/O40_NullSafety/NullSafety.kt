package belajar.oop.O40_NullSafety

data class Friend(val name : String)
// CARA 1
// namaVariable? artinya variable tersebut boleh null
fun sayHello(teman : Friend?){
    println("Hello ${teman?.name}") // ini akan ada kemungkinan error krn bisa teman bisa return null

    // better dengan pengecekkan manual
    if(teman != null){
        println("Hello ${teman.name}") // teman tidak perlu lagi pakai? karena sudah di check.
    }
}

//CARA 2
// elvis style - better pake ini
fun  sayElvis(teman : Friend?){
    val name = teman?.name ?: "" // ini artinya jika teman.name adalah null maka set menjadi string kosong atau ""
    println("ini menggunakan elvis operator: $name")
}

// CARA 3
// sebaiknya jangan dipakai karena kalau Friend adalah null maka dia akan muncul error kotlinNullPointerException
fun pakaiparam(teman : Friend?){
    val name = teman!!.name
    println("pakai operator jasi: $name")
}

fun main() {
    sayHello(Friend("Roni"))
    sayHello(null) // ini akan bisa null
//    pakaiparam(null) // ini akan muncul Null Error : java.lang.NullPointerException
}