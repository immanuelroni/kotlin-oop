package belajar.collection.List

/**
 * Iterable adalah superclass dari Collection interface
 * Iterable adalah general_pgeration untuk melakukan iterasi seluruh data di collection, atau
 * menghapus data di collection
 */

fun <T> cetakIterable(iterable : Iterable<T>){
    // cara manual
    println("cara manual")

    val  iterator = iterable.iterator()
    while (iterator.hasNext()){
        println(iterator.next())
    }
    println("cara gampang")
    // cara gampang
    for(value in iterable){
        println("'$value'")
    }
}

fun <T> cetakIterableMutable(iterable : MutableIterable<T>){
    // cara manual
    println("via mutable")
    val  iterator = iterable.iterator()
    while (iterator.hasNext()){
        val value = iterator.next()
            iterator.remove() // bisa dihapus data iterasi saat ini
        println(value)
    }

    // cara gampang
    println("via gampang")
    for(value in iterable){
        println("'$value'")
    }
}

fun main() {
  cetakIterable(listOf("a","b","c"))
  cetakIterable(setOf("1","2","3"))
  println("----------------------------------------")
  cetakIterableMutable(mutableListOf("A","B"))
  cetakIterableMutable(mutableSetOf("A","B"))

}