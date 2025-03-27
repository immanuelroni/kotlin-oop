package belajar.generic._01GenericType

// ini kita pake huruf T saja untuk acuan generic,  bebas bias huruf apaun
// generic artinya tipe datanya kita bebas bisa tentukan.

// jadi class NamaClass <kode generic,kode generic>(val param kode generic){}
class MyData <T>(val firstData: T){

    // generic type sebagai return value
    fun getData() : T = firstData

    fun printData(){
        println("Data is $firstData")
    }
}

fun main() {
    val myDataString : MyData<String> = MyData<String>("Eko")
    myDataString.firstData // ini akan dapat String
    myDataString.printData()

    val myDataInt : MyData<Int> = MyData(12)
    myDataInt.printData()
}