class Kendaraan(var nama: String, var merk: String, var tahun: Int)

val Kendaraan.getKendaraanInfo
    get() =  "Nama Pemilik: ${this.nama}, Merk: ${this.merk}, Tahun: ${this.tahun}"

fun main() {
    val avanza = Kendaraan("Joko", "Avanza", 2019)
    println(avanza.getKendaraanInfo)
}