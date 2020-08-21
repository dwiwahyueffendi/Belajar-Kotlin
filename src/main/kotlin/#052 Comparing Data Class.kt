data class dataUser2(val nama: String, val umur: Int)

fun main(){
    val userA = dataUser2("Wahyu", 20)
    val userB = dataUser2("Wahyu", 20)
    val userC = dataUser2("Wahyu", 30)
    val userD = dataUser2("Effendi", 20)

    println(userA.equals(userB))
    println(userA.equals(userC))
    println(userA.equals(userD))
}