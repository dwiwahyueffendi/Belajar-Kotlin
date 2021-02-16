fun main(){
    val nilai = 10
    val range = 1..100

    when(nilai){
        in range -> println("Nilai berada dalam range")
        !in range -> println("Nilai tidak berada dalam range")
        else -> println("Tidak Terdefinisi")
    }
}