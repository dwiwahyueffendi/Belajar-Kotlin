//Konsep dari Enumeration sendiri sama seperti Array.
//Oleh karena itu, selain mendapatkan daftar dan nama dari tiap objek Enum,
//Juga bisa mendapatkan posisi tiap objek menggunakan properti ordinal
fun main(){
    val banyakwarna: Color4 = Color4.Hijau
    print("Posisi Hijau Berada di ${banyakwarna.ordinal}")
}

enum class Color4(val value: Int){
    Merah(0xFF0000),
    Hijau(0x00FF00),
    Biru(0x000F0F),
    Kuning(0x0000FF)
}