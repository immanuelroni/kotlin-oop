package belajar.oop.O37_ObservableProperties

import kotlin.properties.Delegates


class ObsPro(descriptionParam : String = ""){
 val name : String by lazy {
     println("Call Lazy")
     "name is called"
 }

 // observable properties
 var description : String by Delegates.observable(descriptionParam){ // pakai descriptionParam sebagai value awal
     property, oldValue, newValue ->
     println("${property.name}, from: $oldValue to: $newValue")
 }


}