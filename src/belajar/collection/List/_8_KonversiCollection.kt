package belajar.collection.List

/**
 * Konversi Collection
 * Di kotlin kita bisa melakukan konversi collection kejenis collection lain secara mudah
 * Misal kita ingin mengubah dari array ke list, atau dari range ke set, atau dari set ke list, bisa dilakukan dengan mudah
 * Semua function dimulai dengan kata "to", misal toList, toSet, toMutableList, dan lain-lain
 */


fun main() {
    val array = arrayOf(1,2,3,4,5,6,7,8,9,10)
    val range = 1..100

    val list = range.toList()
    val set = list.toSet()

    val mutableList = array.toList()
    val mutableSet = list.toMutableSet()

    val sortedSet = mutableSet.toSortedSet()

    for (x in mutableList){
        println(x)
    }
}