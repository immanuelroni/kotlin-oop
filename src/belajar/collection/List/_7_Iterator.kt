package belajar.collection.List

/**
 * Iterator
 * Sebelumnya kita sudah bahas tentang Iterator di Iterable dan Mutablelterator di Mutablelterable
 * Iterator juga memiliki child interface, yaitu Listlterator dan MutableListlterator
 * Listlterator digunakan Oleh List, dan MutableListlterator digunakan Oleh MutableList tetap menggunakan Iterator
 * Sedangkan Map tidak mendukung Iterator
 */
// list Iterator biasa
fun <A> displayListIterator(listIterator : ListIterator<A>){
    while (listIterator.hasNext()) println(listIterator.next())
    println("----------------")
    while (listIterator.hasPrevious()) println(listIterator.previous())
}

//mutable list iterator
fun <B> displayMutListIterator(mutableListIterator : MutableListIterator<B>){
    while (mutableListIterator.hasNext()) println(mutableListIterator.next())
}
// remove interaction mutable list iterator
fun removeOddNumber(mutableListIterator : MutableListIterator<Int>){
    while (mutableListIterator.hasNext()){
        val item = mutableListIterator.next()
        if(item % 2 == 1) mutableListIterator.remove()
    }
}

fun main() {
    displayListIterator(listOf("Adi","Budi", "Dandi", "Ayu").listIterator())
    val data = mutableListOf(1,1,2,2,9,10,100)
    removeOddNumber(data.listIterator())
    displayMutListIterator(data.listIterator())
//    removeOddNumber()
//    removeOddNumber()
}