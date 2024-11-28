package belajar.oop.O38_DestructuringDeclaration

data class Login(val username: String, val pass: String)
typealias LoginCallback = (Login) -> Boolean

fun login(login: Login, callback: LoginCallback): Boolean {
    return callback(login)
}