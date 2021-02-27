fun main(){
    val textString = "12345"
    val textInt = textString.toInt()
    val textDouble = textString.toDouble()

    println(textInt is Int)
    println(textDouble is Double)
}