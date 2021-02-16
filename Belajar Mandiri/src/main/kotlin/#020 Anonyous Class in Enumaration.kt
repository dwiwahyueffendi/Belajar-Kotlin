fun main(){
    val warnaMerah = Color.Merah
    val warnaHijau = Color.Hijau
    val warnaKuning = Color.Kuning
    val warnaBiru = Color.Biru

    warnaMerah.printValue()
    warnaHijau.printValue()
    warnaKuning.printValue()
    warnaBiru.printValue()
}

enum class Color(val value: Int){
    Merah(0xFF0000){
        override fun printValue(){
            println("Nilai Merah adalah $value")
        }
    },
    Hijau(0x00FF00){
        override fun printValue(){
            println("Nilai Hijau adalah $value")
        }
    },
    Kuning(0x00F0F0){
        override fun printValue(){
            println("Nilai Kuning adalah $value")
        }
    },
    Biru(0x0000FF){
        override fun printValue(){
            println("Nilai Biru adalah $value")
        }
    };

    abstract fun printValue()
}