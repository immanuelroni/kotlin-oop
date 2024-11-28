package belajar.oop.`17_Equals`

class Company(val nama : String) {

    override fun equals(other: Any?): Boolean {
        return when(other){
            //menerapkan typeChecker juga dengan is Company
            is Company -> this.nama == other.nama
            else -> false
        }
    }

    // HashCode
    // membuat hashcode jadi true ketika namanya sama.
    override fun hashCode(): Int {
        return this.nama.hashCode()
    }
}