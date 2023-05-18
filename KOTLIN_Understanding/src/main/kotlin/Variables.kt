fun main() {
    var a: Int = 5
    var b: String = "Deepak"
    var c: Boolean = true
    var d: Double = 2.34
    var e: Char = 'A'
    var f: Float = 2.4F
    var g :Int
    g = 2

    println(a)
    println(a+6)
    //println(a+b) //  will throw error
    println(b+a)
    println(b+" and"+5)
    println(c)
    println(d)
    println(e)
    println(f)
    println(g)

    val myNum1: Float = 35E3F
    val myNum2: Double = 12E4
    println(myNum1)
    println(myNum2)

    //Type Conversion
    var value :Int = 4
    var value2 : Double = value.toDouble()
    println(value2)
}
