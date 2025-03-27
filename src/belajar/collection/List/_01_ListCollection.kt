package belajar.collection.List

/**
 * List
 * List, adalah collection yang datanya seperti Array dan memiliki akses data menggunakan index
 * Data di List boleh duplicate, artinya kita boleh memasukkan data yang sama berkali-kali ke dalam ebuah List yang sama
 * List itu dinamis size nya  kalau mutable, secara default akan tidak dinamis
 */

// sebenernya mirip map, tp key nya adalah int yang otomatis



fun main() {
    //Imutable
    // val namaVariable : List<Type> = listof()
    val list : List<String> = listOf("immanuel","roni","kristian","hanoko")

    println(list[0])
    println(list[1])
    println(list[2])
    println(list[3])
    println(list.indexOf("roni"))
    println(list.indexOf("tes"))
    println(list.contains("roni"))
    println(list.containsAll(listOf("roni","immanuel")))
    println(list.isEmpty())
    println(list.isNotEmpty())

    //MutableList
    val mutableList : MutableList<String> =  mutableListOf() // gak perlu isi langsung

    println("----- Mutable -----")
    mutableList.add("immanuel")
    mutableList.add("roni")
    mutableList.add("sayang")
    mutableList.set(0,"Nama:")
    println(mutableList[0])
    println(mutableList.indexOf("test"))
    println("----- for -----")
    for( i in mutableList){
        println(i)
    }

}