fun main(){
    val nilai = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)
    val hitung = nilai.count()
    val hitung1 = nilai.count{it % 2 == 0}

    println(hitung)
    println(hitung1)
}