interface ITerbang{
    fun terbang()
    val jumlahSayap: Int
}

class burung(override val jumlahSayap: Int): ITerbang{
    override fun terbang() {
        if(jumlahSayap > 0) println("Terbang dengan $jumlahSayap sayap")
        else println("Tidak bisa terbang")
    }
}

fun main(){
    val merpati = burung(4)
    merpati.terbang()
}