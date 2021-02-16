data class dataUser6(val nama: String, val umur: Int)

fun main(){
    val UserY1 = dataUser6("Wahyu", 20)
    val (nama, umur) = UserY1

    println("Hallo Nama Saya $nama dan saya berumur $umur")
}