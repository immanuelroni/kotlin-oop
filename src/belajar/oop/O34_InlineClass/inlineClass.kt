package belajar.oop.O34_InlineClass
// hanya boleh ada 1 constructor dan tidak boleh kosong / tanpa constructor

inline class inlineClass(val param : String) {
    fun cetakCaptipal() : String = param.uppercase()
}