//Spread Operator
fun main(){
    val arrayNilai = intArrayOf(10, 20, 20, 30, 40, 50)
    sets(1000, 1000, *arrayNilai, 2000)     //Implementasi Spread Operator
}

fun sets(vararg arrayNilai: Int): Int{
    return arrayNilai.sum()
}