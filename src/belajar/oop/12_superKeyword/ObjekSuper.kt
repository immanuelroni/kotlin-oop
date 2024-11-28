package belajar.oop.`12_superKeyword`

/**
 *   Kadang kita ingin mengakses function atau properties milik class parent yang sudah dibuat ulang oleh class child.
 *   Untuk mengakses function tersebut milik parent, kita bisa menggunakan kata kunci super.
 *   super hanya bisa mengakses 1 level di atasnya, jd induknya saja bukan simbahnya, jadi tidak bisa pakai, super.super.variable
 */


fun main() {

    val shape2 = Rectangle()
    println("Corner:${shape2.corner}")
    println("Parent Corner: ${shape2.parentCorner}")
    shape2.printName()
}


