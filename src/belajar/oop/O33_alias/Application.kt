package belajar.oop.O33_alias

class Application(val name: String) {
    //syntaxnya mirip singleton
    companion object {
        fun hello(name : String){
            println("Hello $name")
        }
    }
}