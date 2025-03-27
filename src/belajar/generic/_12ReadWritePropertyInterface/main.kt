package belajar.generic._12ReadWritePropertyInterface

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 * Read Write Property Interface
 * Selain ReadOnlyProperty, kita juga menggunakan interface generic ReadWriteProperty sebagai
 * delegate
 * ReadWriteProperty bisa digunakan untuk variable var (mutable)
 */

class StringLogReadWritePropery(var data : String) : ReadWriteProperty<Any, String>{
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        println("you get data ${property.name} is $data")
        return data
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: String) {
        println("You set data ${property.name} from $data to $value")
        data = value
    }
}

class UserLog(log : String){
    var log : String by StringLogReadWritePropery(log)
}

fun main() {

    // jadi setiap data yang diakses akan menjalankan fungsi get dan set
    var data1 = UserLog("log1")
    data1.log = "Asoi"
    println(data1.log)

}