data class dataUser3(val nama:String, val umur:Int)

fun main(){
    val userA1 = dataUser3("Wahyu", 20)
    val userA2 = userA1.copy()

    println(userA2)
}