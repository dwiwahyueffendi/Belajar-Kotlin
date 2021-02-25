typealias  aritmatika1 = (Int, Int) -> Int
val tambah1: aritmatika1 = {valueA, valueB -> valueA + valueB}
val kali1: aritmatika1 = {valueA, valueB -> valueA * valueB}

fun main(){
    val hasilTambah = tambah1.invoke(30, 20)
    val hasilKali = kali1.invoke(30, 20)
    println(hasilTambah)
    println(hasilKali)
}