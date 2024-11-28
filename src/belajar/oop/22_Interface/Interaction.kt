package belajar.oop.`22_Interface`

interface Interaction {
    val name : String
    fun sayHello(name : String) // ini bisa ada implementasi disini gak harus di childnya.

    // function di interface boleh ada implementasinya, sehingga bisa juga tidak di override.
    fun sayEmoji(emoji : String){
        println("my Emoji is: $emoji")
    }
}

// semua members atau properties dan function dari interface harus di implementasikan di childnya.
class Human : Interaction { // berbeda dengan extends, jika extends harus ada namaClass()

    override val name: String

    constructor(name: String) {
        this.name = name
    }

    override fun sayHello(name: String) {
        println("Hello,$name nama saya adalah: ${this.name}")
    }

}