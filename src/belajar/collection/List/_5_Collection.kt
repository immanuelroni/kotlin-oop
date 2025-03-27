package belajar.collection.List

/**
 * Collection
 * Semua data collection adalah turunan dari interface Collection
 * Collection digunakan sebagai general operation terhadap struktur data collection, seperti
 * membaca dan menulis data di collection
 */


fun <T> printCollection(collection : Collection<T>){
    for (item in collection){
        println(item)
    }
}
fun main() {
    printCollection(listOf("a","b"))
    printCollection(setOf("1","2","3"))
//    printCollection(mapOf("A" to "1")) // ini akan error karena map bukan merupakan bagian dari Collection Interface
}