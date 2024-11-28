package belajar.oop.O28_InnerClass

class Boss(val boosName: String) {


    // dengan kata kunci inner maka employee bisa mengakses properties dari bos
   inner class Employee(val EName : String){
        fun hi(){
//           println("Say Hi $bossName") // ini tidak bisa dilakukan, tanpa kata kunci inner, di class Employee
            println("Hi ${this@Boss.boosName}, saya ${EName}, siap membantu") // dengan kata kunci inner jadi bisa diakses
        }
    }
}