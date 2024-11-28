package belajar.oop.O42_Annotation
@Target(AnnotationTarget.CLASS) // ini format yang bisa di masukkan ke parameter target itu Array ya, jd bisa banyak
@Retention(AnnotationRetention.RUNTIME) // apakah bisa dibaca Retention saat runtime, ini di set Ya
@MustBeDocumented
annotation class Fancy(val pembuat : String) // annotation tidak bisa memiliki attribute
