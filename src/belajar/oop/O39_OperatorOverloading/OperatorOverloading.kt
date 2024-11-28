package belajar.oop.O39_OperatorOverloading

/**
 * ----- Operator Overloading -----
 * Kotlin mendukung operator overloading, artinya kita bisa membuat function dari
 * operator-operator seperti operator matematika, dan lain-lain
 * Kemampuan ini membuat kita bisa melakukan operasi apapun di object seperti layaknya tipe data
 * Integer
 * Ada banyak sekali operator yang bisa di override di Kotlin
 */

/**
 * Unary Prefix Operator
 * ----------------------------
 * Expression | Translated to
 * ----------------------------
 * +a =  a.unaryPlus()
 * -a = a.unaryMinus( )
 * !a = a.not()
 * ------------------------
 * Increment dan Decrement
 * a++ = a.inc()+see below
 * a-- = a.dec()+see below
 * -----------------------
 * Aritmatika Operator
 * a+b = a.plus(b)
 * a-b = a.minus(b)
 * a*b = a.times(b)
 * a/b = a.div(b)
 * a..b = a.rangeTo(b)
 * dan yang lainya
 * -----------------------
 * In Operator
 * a in b = b.contains(a)
 * a !in b = !b.contains(a)
 * ------------------------
 * Index Access Operator
 * a[i]             = a.get(i)
 * a[i,j]           = a.get(i,j)
 * a[i_1,...,i_n]   = a.get(i_1,...,i_n)
 * a[i] = b         = a.set(i,b)
 * a[i,j] = b       = a.get(i,j,b)
 * a[i_1,...,i_n] = b  = a.get(i_1,...,i_n,b)
 * -----------------------------------------
 * Invoke Operator
 * a()      = a.invoke()
 * a(i)     = a.invoke(i)
 * a(i,j)   = a.invoke(i,j)
 * a(i_1,...,i_n)   = a.invoke(i_1,...,i_n)
 * ------------------------------------------
 * Assignment Operator
 * a+= b        = a.plusAssign(b)
 * a-= b        = a.minusAssign(b)
 * a*= b        = a.timesAssign(b)
 * a/= b        = a.divAssign(b)
 * a %= b       = a.remassign(b),a.modAssign(b), ini sudah usang / deprecated
 *----------------------------------------------------------------------------
 * Equality dan Inequality Operator
 * a == b           = a?.equals(b)?: (b === null)
 * a != b           = !(a?.equals(b)?: (b === null))
 * --------------------------------------------------------------------------
 * masih banyak yang lainya better check dokumentasinya agar jelas
 */

fun main() {
    val buah1 = Fruits(100)
    val buah2 = Fruits(10)
    val buah3 = buah1 + buah2
    println(buah3)
    println(buah2-buah1)
}