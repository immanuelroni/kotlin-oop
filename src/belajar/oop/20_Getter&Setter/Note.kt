package belajar.oop.`20_Getter&Setter`

class Note(title:String) {
    var title : String = title
        // fungsi getter
        get() = field   // field adalah kata kunci untuk title jadi dia mengembalikan nilai titile

        //fungsi setter
        set(value) {
            if (value.isNotBlank()){    // mencegah agar tak di isi blank
                field = value
            }

        }
}

class UpperCaseNOte(val title: String){
    val UpTitle : String    // ini kita buat val agar tidak bisa di set()
        get() = title.uppercase()
}