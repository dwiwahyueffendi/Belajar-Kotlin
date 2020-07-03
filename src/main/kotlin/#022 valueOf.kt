//Untuk mendapatkan daftar objek Enum kita bisa menggunakan fungsi values().
//Sedangkan untuk mendapatkan nama dari objek Enum kita bisa menggunakan fungsi valueOf()
fun main(){
    val banyakwarna: Color2 = Color2.valueOf("Merah")
    println("Warnanya adalah $banyakwarna")
}

enum class Color2(val value: Int){
    Merah(0xFF0000),
    Hijau(0x00FF00),
    Biru(0x000F0F),
    Kuning(0x0000FF)
}