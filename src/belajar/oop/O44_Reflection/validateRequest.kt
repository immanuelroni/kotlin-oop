package belajar.oop.O44_Reflection

// nah cara seperti ini kan capek ya, apalagi kalau sudah kompleks sekali. makanya kita perlu pake Reflection
// aku import validation Exception
import belajar.oop.O41_Exception.ValidationException
import kotlin.reflect.full.memberProperties

import kotlin.reflect.full.findAnnotation

// Cara seperti di bawah ini tuh capek dan inilah alasan Reflection diciptakan agar lebih mudah.
// Saya Comment karena pake Class NotBlank saja biar enak, pakai cara Reflection
/*
fun validateRequest(request: createProductRequest){
    if (request.id == ""){
        throw ValidationException("id is blank")
    }else if (request.name == ""){
        throw ValidationException("Name is blank")
    }
}

fun validateRequest(request: CreateCategoryRequest){
    if (request.id == ""){
        throw ValidationException("id is blank")
    }else if (request.name == ""){
        throw ValidationException("Name is blank")
    }
}
 */

/**
 * Solusinya pakai Reflection
 *
 */
fun validateRequest(request: Any){
val clazzz = request::class
val properties = clazzz.memberProperties
// iterate satu satu, talu cek kalo ada annotation @NotBlank
for (property in properties) {
    if (property.findAnnotation<NotBlank>() != null) {
        val value = property.call(request)
        when (value){
            is String -> {
                if(""==value){
                    throw ValidationException("Bro : ${property.name} is blank")
                }

            }
        }

    }
}

    }
/** ----- ini cara dengan AI -----
fun validateRequest(request: Any) {
    // Dapatkan kelas dari objek request
    val clazz = request::class

    // Iterasi melalui semua properti di kelas
    for (property in clazz.members.filterIsInstance<KProperty1<Any, *>>()) {
        // Periksa apakah properti memiliki anotasi NotBlank
        val notBlankAnnotation = property.annotations.find { it is NotBlank }

        if (notBlankAnnotation != null) {
            // Ambil nilai properti
            val value = property.get(request)

            // Validasi untuk string
            if (value is String) {
                // Cek apakah string kosong atau hanya berisi spasi
                if (value.isBlank()) {
                    throw IllegalArgumentException("Property ${property.name} tidak boleh kosong")
                }
            }
        }
    }
}
 */