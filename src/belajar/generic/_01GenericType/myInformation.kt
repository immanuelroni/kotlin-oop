package belajar.generic._01GenericType

class MyInformation<A,B>(val dataPertama: A, val dataKedua: B) {

    fun printInfo(){
        println("Datamu adalah $dataPertama $dataKedua")
    }

    // jangan asal pake nama getDataPertama karena akan error dengan naming JVMnya.
    fun ambilDataKedua() : B{
        return  dataKedua
    }

    // jangan asal pake nama getDataPertama karena akan error dengan naming JVMnya.
    fun ambilDataPertama() : A{
       return dataPertama
    }
}

fun main() {
//    val info1 : MyInformation<String,String> = MyInformation<String,String>("Satu","Dua")
    // syntax pendeknya bisa ditulis demikian.
    // kotlin akan tahu isinya String kalau kita kasih data String
    val info1  = MyInformation("Satu","Dua")
    info1.printInfo()
//    info1.getDataPertama()
    println(info1.ambilDataKedua())
    println(info1.ambilDataPertama())
}