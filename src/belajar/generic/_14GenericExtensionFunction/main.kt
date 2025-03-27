package belajar.generic._14GenericExtensionFunction

/**
 * Generic Extension Function
 *
 * Generic juga bisa digunakan pada extension function
 * Dengan begitu kita bisa memilih jenis generic parameter type apa yang bisa menggunakan
 * extension function tersebut
 */


class Data<A>(val data : A)

// membuat extension fucntion untuk Data String
fun Data<String>.cetak(){
    val paramCetak = this.data
    println("Data : $paramCetak")
}
fun main() {

    // data1 tidak bisa karena extension function yang kita buat hanyalah untuk String saja.
    val data1 : Data<Int> = Data(1)
    val data2 : Data<String> = Data("Data2")

//    data1.cetak() // ini akan error
    data2.cetak()
}