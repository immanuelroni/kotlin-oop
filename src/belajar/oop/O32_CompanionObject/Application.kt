package belajar.oop.O32_CompanionObject

class Application(val name: String) {
    //syntaxnya mirip singleton tp depannya ada companion
    companion object {
        fun hello(name : String){
            println("Hello $name")
        }
    }
}