//Instead of writing many if..else expressions, you can use the when expression,
// which is much easier to read.
//It is used to select one of many code blocks to be executed:
fun main() {
    var day = 4
    var dayofweek : String = when (day){  //its similler to switch statement in kotlin
        1-> "Monday"
        2->"Tuesday"
        3-> "Wednesday"
        4-> "Thursday"
        else-> "Invalid Day"
    }
    println(dayofweek)

}