//Primary Constructor
class hewanDarat(val nama: String, val berat: Int, val umur: Int, val mamalia: Boolean = true)

fun main(){
    val anjing = hewanDarat("Miaww", 2, 2)
    println("Nama : ${anjing.nama}, Berat : ${anjing.berat} Kg, Umur : ${anjing.umur} Tahun, Mamalia : ${anjing.mamalia}")
}