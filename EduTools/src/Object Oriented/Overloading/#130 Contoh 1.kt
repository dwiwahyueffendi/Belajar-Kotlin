class kalkulator{
    fun add(value1: Int, value2: Int) = value1 + value2
    fun add(value1: Int, value2: Int, value3: Int) = value1 + value2 + value3
    fun min(value1: Double, value2: Double) = if(value1 < value2) value1 else value2
}

fun main(){
    var hitung = kalkulator()
    println(hitung.add(1,2,3))
    println(hitung.min(1.0, 4.0))
    println(hitung.add(1,5))
}