fun main(){
    val warnaMerah = warna.Merah
    val warnaHijau = warna.Hijau
    val warnaKuning = warna.Kuning
    val warnaBiru = warna.Biru

    println(warnaMerah)
    println(warnaHijau)
    println(warnaKuning)
    println(warnaBiru)
}

enum class warna(val value: Int){
    Merah(0xFF0000),
    Hijau(0xFF0000),
    Kuning(0xFF0000),
    Biru(0xFF0000)
}