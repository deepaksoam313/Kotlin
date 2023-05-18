//With the for loop, you can also create ranges of values with "..":

fun main() {
    for(a in 5..15)
        println(a)

    //You can also use the in operator to check if a value exists in a range:
    val numbers = arrayOf(1,2,3,4,5,6,6,7,8,9)
    if (5 in numbers) {
        println("found")
    } else {
        println("not found")
    }
}