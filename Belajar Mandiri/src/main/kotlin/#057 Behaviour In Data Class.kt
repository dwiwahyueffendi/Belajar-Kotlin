data class dataUser7(val nama: String, val umur: Int){
    fun intro(){
        println("Hi.. Nama Saya $nama dan saya berumur $umur")
    }
}

fun main(){
    val UserX1 = dataUser7("Wahyu", 21)
    UserX1.intro()
}