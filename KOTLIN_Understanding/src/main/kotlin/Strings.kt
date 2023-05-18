import java.util.*

fun main() {
    var stringValue :String
    stringValue = "Deepak Soam"

    //String Length
    println(stringValue.length)

    //print value at particular index
    println(stringValue[1])

    //Finding a string into a string
    println(stringValue.indexOf("Soam"))

    //Upppercase and lowerCase
    println(stringValue.uppercase(Locale.getDefault()))
    println(stringValue.toLowerCase())

    var txt2 = "That's great"
    println(txt2)

    println(stringValue.compareTo(txt2)) //-16
    println(stringValue.plus(txt2)) // to concatenate we can use either "+" or plus() method

    //String Templates
    println("My name is $stringValue")

}