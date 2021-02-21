//Fungsi enumValues di gunakan untuk mendapatkan daftar objek Enum dan nama dari objek Enum dengan cara yang lebih umum
fun main(){
    val banyakwarna : Array<Color3> = enumValues()
    banyakwarna.forEach { warna -> println(warna) }

    val warna: Color3 = enumValueOf("Biru")
    println("Warnanya adalah $warna")
}

enum class Color3(val values: Int){
    Merah(0xFF0000),
    Hijau(0x00FF00),
    Biru(0x000F0F),
    Kuning(0x0000FF)
}
