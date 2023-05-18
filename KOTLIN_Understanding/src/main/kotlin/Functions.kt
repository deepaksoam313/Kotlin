fun main() { // main function
    myName("Deepak Soam")
    println(calculate(5,6))
    println(subtraction(10,4))
}

//User defined function
fun myName(name:String){
    //In built function
    println("My name is $name")
}

// A Function with Return Values

fun calculate(a:Int, b:Int): Int{
    var returnInt = a + b
    return returnInt
}
//Shorter Syntax for Return Values
fun subtraction(a : Int, b : Int) = a-b
