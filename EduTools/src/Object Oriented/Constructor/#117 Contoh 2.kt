//Init Block
class hewanDarat1(val nama1: String, val berat1: Double, val umur1: Int, val mamalia1: Boolean = true){
    val nama: String
    val berat: Double
    val umur: Int
    val mamalia: Boolean

    init {
        nama = nama1
        berat = if (berat1 < 1) 2.0 else berat1
        umur = if (umur1 < 1) 1 else umur1
        mamalia = mamalia1
    }
}

fun main(){
    val anjing = hewanDarat1("Miawww", 0.0, 1)
    println("Nama : ${anjing.nama}, Berat : ${anjing.berat} Kg, Umur : ${anjing.umur} Tahun, Mamalia : ${anjing.mamalia}")
}