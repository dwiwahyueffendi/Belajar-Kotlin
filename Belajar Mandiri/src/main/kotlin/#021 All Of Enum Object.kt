fun main(){
    val banyakwarna: Array<Color1> =Color1.values()
    banyakwarna.forEach { warna -> println(warna) }
}

enum class Color1(val value: Int){
    Merah(0xFF0000),
    Hijau(0x00FF00),
    Biru(0x000F0F),
    Kuning(0x0000FF)
}