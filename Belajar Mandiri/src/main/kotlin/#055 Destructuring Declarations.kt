data class dataUser5(val nama: String, val umur: Int)

fun main(){
    val UserX1 = dataUser5("Wahyu", 21)

    val nama = UserX1.component1()
    val umur = UserX1.component2()

    println("Hallo Nama Saya $nama dan saya berumur $umur")
}