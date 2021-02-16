fun main(){
    val banyakwarna: Color5 = Color5.Kuning

    when(banyakwarna){
        Color5.Merah -> print("Warnanya adalah Merah")
        Color5.Hijau -> print("Warnanya adalah Hijau")
        Color5.Biru -> print("Warnanya adalah Biru")
        Color5.Kuning -> print("Warnanya adalah Kuning")
    }
}

enum class Color5(val value: Int){
    Merah(0xFF0000),
    Hijau(0x00FF00),
    Biru(0x000F0F),
    Kuning(0x0000FF)
}