package belajar.oop.O38_DestructuringDeclaration

// harus dengan kata kunci data di depan class
data class Game(val name : String, val price : Int) {
    // dengan kata kunci data, function component tidak dibutuhkan lagi.
//    operator fun componentl(): String = name
//    operator fun component2(): Int = price
}