package belajar.oop.O31_SingletonObject


// singleton dalam sebuah class lain.
class Application(val name : String) {
    object Util{
        fun goUpper(value : String): String{
            return value.uppercase()
        }
    }
}