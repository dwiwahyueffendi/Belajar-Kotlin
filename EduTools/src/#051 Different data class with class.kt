class User1(val nama: String, val umur: Int)/*{
    override fun toString(): String {
        return "User1(nama=$nama, umur=$umur)"
    }
}*/
//Tanpa data class, kita perlu membuat fungsi toString() secara manual
//untuk mendapatkan informasi seperti yang diberikan oleh objek dataUser

data class dataUser1(val nama: String, val umur: Int)

fun main(){
    val user = User1("Wahyu", 21)
    val datauser = dataUser1("Wahyu", 21)

    println(user)
    println(datauser)
}