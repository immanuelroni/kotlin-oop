package belajar.oop.`05_PropertiesConstructor`

/** CARA RIBET KARENA HARUS TAMPUNG DULU
 * class User(usernameP:String, passwordP:String){
 *     // cara ini ribet karena musti nampung dulu
 *     var username: String = usernameP
 *     var password: String = passwordP
 * }
 */

// Solusinya tampung dalam constructornya langsung
// Hanya bisa dibuat di main constructor
class User(var usernameP:String,var passwordP:String){

    // dengan cara ini bisa langsung isi properties di constructor.
    // hanya bisa dilakukan di primary constructor, tidak bisa di secondary constructor
}