package belajar.oop.O39_OperatorOverloading

data class Fruits(val qty : Int) {
    // kata kunci operator lalu pake nama fungsi yang akan di override
    // gunakan Ctrl + Space untuk cek operator apa saja yang akan digunakan.
    operator fun plus(fruits : Fruits): Fruits {
        return Fruits(this.qty + fruits.qty)
    }

    operator fun minus(fruits : Fruits): Fruits {
        return Fruits(this.qty - fruits.qty)
    }
}