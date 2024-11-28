package belajar.oop.O26_DataClass

// setiap propetries ini akan secara otomatis dibuatkan hashCode dll kotlin
// Jadi tiap primary constructor ini dianggap special
data class ProductDataClass(val name: String,
                            val price: Int,
                            val category: String)