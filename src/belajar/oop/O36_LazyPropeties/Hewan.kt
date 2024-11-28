package belajar.oop.O36_LazyPropeties

class Hewan {
    //biasanya
//    val makanan : String = "defaultValue"

    // lazy, val makanan akan diassigned jika dipanggil propertiesnya.
    val makanan : String by lazy {
        // bisa lakukan terserah kita disini
        println("Makanan Hewan")
        "makanan"
    }
}