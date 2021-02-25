typealias  aritmatika = ((Int, Int) -> Int)?
val tambah2: aritmatika = {valueA, valueB -> valueA + valueB}
val kali2: aritmatika = {valueA, valueB -> valueA * valueB}

fun main(){
    val hasilTambah = tambah2?.invoke(30, 20)
    val hasilKali = kali2?.invoke(30, 20)
    println(hasilTambah)
    println(hasilKali)
}