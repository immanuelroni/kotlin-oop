package belajar.oop.O37_ObservableProperties


/**
 * ----- Observable Properties -----
 * Salah satu standar library yang disediakan Oleh Kotlin untuk delegating di properties adalah observable properties
 * Dengan observable properties, kita bisa tahu properties, value sebelum dan value setelah ketika diubah
 */
fun main() {
    val obsPro = ObsPro("Obj1")
//    println(obsPro.name)
    obsPro.description = "test 2"
    obsPro.description = "test 3"

}