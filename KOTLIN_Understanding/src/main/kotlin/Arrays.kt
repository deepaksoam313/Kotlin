//To create an array, use the arrayOf() function,
// and place the values in a comma-separated list inside it:
fun main() {
    val names = arrayOf("Deepak", "Manish", "Ravi", "Prashant")

    for(a in names){
        println(a)
    }
    names[0]= "Chintu"
    println("Changed value is"+ names[0])

    //Array size
    println(names.size)

    if(names.contains("Deepak"))
        println("found")
    else
        println("Not found")


}