fun main(){
    val nilai = listOf(1, 2, 3, 4, 5)
    val firstNilai = nilai.first { it == 2 }     //Mencari dari pertama
    val lastNilai = nilai.last { it == 5 }       //Mencari dari terakhir

    println(firstNilai)
    println(lastNilai)
}