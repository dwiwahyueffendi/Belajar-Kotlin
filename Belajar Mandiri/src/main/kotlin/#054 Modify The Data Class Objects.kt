data class dataUser4(val nama:String, val umur:Int)

fun main(){
    val userA1 = dataUser4("Wahyu", 20)
    val userA2 = userA1.copy()
    val userA3 = userA1.copy(umur = 21)

    println(userA2)
    println(userA3)
}