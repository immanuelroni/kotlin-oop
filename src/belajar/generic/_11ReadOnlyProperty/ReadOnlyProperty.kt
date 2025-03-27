package belajar.generic._11ReadOnlyProperty

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

/**
 * Read Only Property
 * Sebelumnyp kita sudah belajar tentang delegate di Kotlin
 * Di Kotlin, ada sebuah interface generic yang bisa digunakan sebagai delegate property yang
 * sifatnya readonly, alias val (immutable), namanya ReadOnlyProperty
 * ReadOnlyProperty bisa digunakan sebagai delegate, sehingga sebelum data kita kembalikan, kita
 * bisa melakukan sesuatu, atau bahkan mengubah value si property
 */

class LogReadOnly(val data : String) : ReadOnlyProperty<Any, String>{

    // jadi tiap akses name. akan run fungsi ini.
    var counter : Int = 0
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        println("Akses data properti: ${property.name} dengan nilai: $data ")
        counter++
        return data.uppercase()+counter
    }

}

class NameWithLog(param : String){
    // sekalipun ini val, namun krn kita delegate di class  lain dengan read only property maka jd bisa diubah
    val name : String by LogReadOnly(param)
}

fun main() {
    val namelog1 = NameWithLog("Percobaan1")
    println(namelog1.name)
    println(namelog1.name)
}