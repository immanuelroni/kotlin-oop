package belajar.oop.O43_AnnotationTarget
@Target(AnnotationTarget.VALUE_PARAMETER,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.FIELD)


@Retention(AnnotationRetention.RUNTIME)
annotation class Beta()

// annotation hanya bisa dilihat di hasil compliasi ke Javanya. check di Show Kotlin Binary Code
// jadi masing2 annotation akan dibuat saat di kompile, annotation target bakal menempatkannya sesuai tag yang kita gunakan
// misal di field ya  bakal di properties
// misal di param, akan ada di constructor
// misal di get, di akan di getter dan setter
// gunakan Ctrl + Space untuk @nya akan ada banyak pilihan
class ExampleTarget(
    @field:Beta val firstName : String,
    @get:Beta val middleName : String,
    @param:Beta val lastName : String
)
