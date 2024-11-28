package belajar.oop.`12_superKeyword`

open class Shape {
    open val corner:  Int = -1

    open fun printName(){
        println("Ini Shape")
    }
}

class Rectangle: Shape() {
    override val corner: Int = 4
    val parentCorner: Int = super.corner

    //akses super function
    override fun printName() {
        println("ini adalah Rectangle")
        super.printName() // akses print parent.
    }
}

class Triangle: Shape() {
    override val corner: Int = 3
    val parentCorner: Int = super.corner // akses super properties
}