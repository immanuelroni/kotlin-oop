package belajar.generic._13ObservablePropertyClass

import kotlin.properties.Delegates
import kotlin.properties.ObservableProperty
import kotlin.reflect.KProperty

/**
 * Observable Property Class
 * Generic interface delegate yang sebelumnya kita gunakan (ReadOnlyProperty dan
 * ReadWriteProperty) kita perlu mengatur value datanya secara manual
 * Kadang kita hanya butuh melakukan sesuatu sebelum dan setelah data nya diubah
 * Untuk kasus seperti ini, kita bisa menggunakan generic class ObservableProperty
 */

class LogObeservableProperty<T>(data : T) : ObservableProperty<T>(data){

    override fun beforeChange(property: KProperty<*>, oldValue: T, newValue: T): Boolean {
//        return super.beforeChange(property, oldValue, newValue)
        println("Before change value from $oldValue to $newValue")
        return true
    }

    override fun afterChange(property: KProperty<*>, oldValue: T, newValue: T) {
//        super.afterChange(property, oldValue, newValue)
        println("After change value from $oldValue to $newValue")
    }

}

class DataLoger(data : String, size : Int){
    var data : String by LogObeservableProperty(data)
    var size : Int by LogObeservableProperty(size)

    // akan throw exception saat null intinya
    var format : String by Delegates.notNull<String>()
    var aspecRatio : String by Delegates.observable(""){
        property, oldValue, newValue ->
        println("Berubah jadi ${property.name} dari $oldValue menjadi $newValue")
    }
}

// ada


fun main() {
    var userData = DataLoger("log-data1",10)
    userData.data
    userData.size

    // akan berubah saat ada perubahan saja, jd saat akses tidak akan ada perubahan
    userData.data = "log-data-admin"
    userData.size = 9

    println(userData.data)
    println(userData.size)

    // biar gak error kita set dulu

    userData.format = "Jpg"
    println(userData.format)

    userData.aspecRatio = "4:2"
    println(userData.aspecRatio)
}

/**
 * Ada Juga Opsi yang lain dengan
 *
 * Function
 * Delegates.notNull()
 * Delegates.vetoable(value, beforeChange) // before changenya nanti isi dengan lambda
 * Delegates.observable(value, afterChange)
 *
 * Keterangan
 * ReadWriteProperty yang nilai awal bisa null, namun error jika masih null
 * ObservableProperty dengan beforeChange
 * ObservableProperty dengan afterChange
 */