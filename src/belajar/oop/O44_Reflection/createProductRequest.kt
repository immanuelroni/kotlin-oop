package belajar.oop.O44_Reflection


data class createProductRequest(
    // dengan reflection kita bisa main mainkan di annotation
    @NotBlank val id : String,
    @NotBlank val name : String,
    val price : Long
)

data class CreateCategoryRequest(
    @NotBlank val id: String,
    @NotBlank val name: String
)


