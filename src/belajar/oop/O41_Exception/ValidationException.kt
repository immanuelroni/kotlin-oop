package belajar.oop.O41_Exception

// better pakai class begini agar enak pengelompokkannya nanti
class ValidationException(pesanError : String) : Throwable(pesanError){

}

fun validateAndSay(name : String){
    if (name.isBlank()){
        throw ValidationException("Name is Blank")
    }else{
        println("aman bro!")
    }
}