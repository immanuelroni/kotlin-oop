package belajar.oop.`03_MainConstructor`

// CONSTRUCTOR
// constructor beda dengan Java yang ada di dalam class, ini langsung seperti fun biasanya
// tidak serperti java yang di inisialisasi di dalam class, ini langsung di parameternya
// hanya saja inisialisasinya akab berbeda



// INIT
// Adalah fun default saat class di inisialisasi


// SECONDARY CONSTRUCTOR
// Kotlin mendukung beberapa constructor, mirip Java
// Namun jumlah paramnya harus beda-beda tidak bisa sama
// Saat buat Sec Constr kita harus panggil primary constructor juga.


// Main Constructor
class HpConstructor(
    // PROPERTIES
    brandParam: String = "Poco",
    versionParam: String?,
    chipsetParam: String
    ) {
    // 'INIT
    // ini adalah func yang ada dalam class, saat class di instansiasi
    // jangan masukkan banyak fun,disini krn bikin berat
    init {
        println("Init Hp $brandParam berhasil dibuat!")
    }

    // ini contoh constructor, jumlah param tidak boleh sama dengan primary
    // saya buat 2 param saja
    constructor(brandParam: String = "Samsung",
                versionParam: String?
    ): this( // ini call primary
        brandParam,
        versionParam,
        "Mediatek T100"){
        println("Second Constractor: $brandParam,Seri: $versionParam, Chipset: Mediatek T100 Chipset")
    }

    // bisa juga dibuat lebih dari satu constructor secondary
    // ini gak harus panggil primary constructor, namun bisa panggil yang secondary.
    // ini saya coba pake1 param saja, yaitu brand
    constructor(brandParam: String
    ): this( // ini call primary
        brandParam,
        "Universal Version"
    ){
        println("Third Constractor: $brandParam,Version: Universal Version, Mediatek T100 Chipset")
    }

    // manage properties
    var brand: String = brandParam
    var version: String? = versionParam
    var chipset: String = chipsetParam
}

fun main() {

    val pocoX6Pro = HpConstructor(
        brandParam = "Poco",
        versionParam = "X6",
        chipsetParam = "Snapdragon 8 Gen 2"
    )
    val hp2 = HpConstructor(
        brandParam = "Samsung",
        versionParam = "S23-5G",
        chipsetParam = "Snapdragon 8 Gen 2"
    )

    val hp3 = HpConstructor(
        "Xiaomi",
        versionParam = "Redmi T"
    )
    val hp4 = HpConstructor(
        brandParam = "Bebas Phone"
    )

//    println("Hp ini: ${pocoX6Pro.brand} versi: ${pocoX6Pro.version} dengan chipset: ${pocoX6Pro.chipset} ")
//    println("Hp ini: ${hp2.brand} versi: ${hp2.version} dengan chipset: ${hp2.chipset} ")
//    println("Hp ini: ${hp3.brand} versi: ${hp3.version} dengan chipset: ${hp3.chipset} ")
//    println("Hp ini: ${hp4.brand} versi: ${hp4.version} dengan chipset: ${hp4.chipset} ")


}