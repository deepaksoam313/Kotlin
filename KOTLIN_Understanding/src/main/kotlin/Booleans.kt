import kotlin.String
fun main() {
    val isKotlinFun: Boolean = true // Kotlin is smart enough to understand the value assigned is boolean so it will implicitely changed to boolean value itself
    val isFishTasty: Boolean = false
    println(isKotlinFun)   // Outputs true
    println(isFishTasty)   // Outputs false


    val x = 10
    val y = 9
    println(x > y) // Returns true, because 10 is greater than 9
    println(x == y)
}