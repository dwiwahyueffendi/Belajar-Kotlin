fun main(){
    val nilai = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    val genap = nilai.filter { it % 2 == 0 }
    val ganjil = nilai.filterNot { it % 2 == 0 }

    println(ganjil)
    println(genap)
}