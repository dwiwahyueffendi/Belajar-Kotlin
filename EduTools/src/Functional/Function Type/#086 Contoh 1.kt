val tambah: (Int, Int) -> Int = {valueA, valueB -> valueA + valueB}
val kali: (Int, Int) -> Int = {valueA, valueB -> valueA * valueB}

fun main(){
    val hasilTambah = tambah.invoke(20, 20)
    val hasilKali = kali.invoke(20, 20)
    println(hasilTambah)
    println(hasilKali)
}