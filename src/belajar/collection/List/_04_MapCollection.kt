package belajar.collection.List

/**
 * Map
 * Map (atau dictionary), adalah collection yang berbentuk key-value, dimana key berperan sebagai index.
 * Key harus unik, jika kita menggunakan Key yang sama, maka data sebelumnya akan di replace Oleh data yang baru
 * Tipe data key bisa menggunakan tipe data apapun sesuai yang kita inginkan
 */


// sebenernya mirip dengan list, hanya key nya adalah int yang otomatis

fun main() {
    val map : Map<String,String> = mapOf(
        "A" to "1",
        "B" to "2",
        "C" to "3",
        "D" to "4"
    )
    println("----- Print Map -----")
    println(map.size)
    println(map["A"])
    println(map.isEmpty()) // false
    println(map.containsKey("C")) // true
    println(map.containsValue("2")) // true
    println(map.get("C")) // get key C dapat angka 3 
    println("---------")

    // cara 1, sebenarnya kita akses map.entries
    for(entry in map){
        println(entry.key)
        println(entry.value)
        println("------")
    }

    println("cara 2: ")
    // cara 2 : destructuring
    for((key,value) in map){
        println("$key to $value")
    }

    println("-------------------")
    // bisa juga
    println(map.keys)
    println("-------------------")
    println(map.values)

    /**
     * MUTABLE MAP
     */
    println("------ MUTABLE MAP -----")

    val mutableMap : MutableMap<String,String> = mutableMapOf()
    mutableMap["a"] = "A"
    mutableMap["b"] = "B"
    mutableMap["c"] = "C"
    mutableMap["d"] = "D"

    println(mutableMap["c"])
    println(mutableMap.get("a")) // bisa return null
    println(mutableMap.getOrDefault("x","dafault_Value"))

    for((key,value)in mutableMap){
        println("key: $key, value: $value")
    }

}