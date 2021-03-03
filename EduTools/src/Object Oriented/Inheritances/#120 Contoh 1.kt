open class hewanPeliharaan(val nama: String, val berat: Double, val umur: Int){
    open fun makan(){
        println("$nama sedang makan")
    }

    open fun tidur(){
        println("$nama sedang tidur")
    }
}

class kucing(pNama: String, pBerat: Double, pUmur: Int, pJumlahKaki: Int):
        hewanPeliharaan(pNama, pBerat, pUmur){
            fun bermain(){
                println("$nama sedang bermain")
            }

            override fun makan(){
                println("$nama sedang makan ikan")
            }

            override fun tidur(){
                println("$nama sedang tidur di kasur")
            }
        }

fun main(){
    val peliharaan = kucing("Puss", 2.1, 2, 4)
    peliharaan.bermain()
    peliharaan.makan()
    peliharaan.tidur()
}