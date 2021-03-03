//Second Costructor
class hewanDarat2(nama: String, berat: Double, umur: Int){
    val nama: String
    val berat: Double
    val umur: Int
    var mamalia: Boolean

    init {
        this.nama = nama
        this.berat = if (berat < 1) 2.0 else berat
        this.umur = if (umur < 1) 1 else umur
        this.mamalia = true
    }

    constructor(nama: String, berat: Double, umur: Int, mamalia: Boolean): this(nama, berat, umur){
        this.mamalia = mamalia
    }
}

fun main(){
    val anjing = hewanDarat2("Meong", 0.0, 1)
    println("Nama : ${anjing.nama}, Berat : ${anjing.berat} Kg, Umur : ${anjing.umur} Tahun, Mamalia : ${anjing.mamalia}")

    val burung = hewanDarat2("Cuitt", 0.0, 2, false)
    println("Nama : ${burung.nama}, Berat : ${burung.berat} Kg, Umur : ${burung.umur} Tahun, Mamalia : ${burung.mamalia}")
}