package belajar.oop.O38_DestructuringDeclaration

data class MinMax(val min : Int, val max : Int)

// dia returnnya class MinMax
fun minMax(satu : Int,dua : Int) : MinMax{
    return when {
        satu > dua -> MinMax(dua,satu)
        else -> MinMax(satu,dua)
    }
}