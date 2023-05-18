//Unlike Java and other programming languages, there is no traditional for loop in Kotlin.

//In Kotlin, the for loop is used to loop through arrays, ranges,
// and other things that contains a countable number of values.

fun main() {
    val cars = arrayOf("Deepak", "Ravi", "manish", "Pk")
    for( a in cars){
        println(a)
    }
}