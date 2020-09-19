class User2(val nama:String, val umur: Int){
    override fun equals(other: Any?): Boolean {
        if(this === other) return true
        if(javaClass != other?.javaClass) return false

        other as User2

        if(nama != other.nama) return false
        if(umur != other.umur) return false
        return true
    }

    override fun hashCode(): Int {
        var result = nama.hashCode()
        result = 30 * result + umur
        return result
    }
}

fun main(){
    val userA = User2("Wahyu", 20)
    val userB = User2("Wahyu", 20)
    val userC = User2("Wahyu", 30)
    val userD = User2("Effendi", 20)

    println(userA.equals(userB))
    println(userA.equals(userC))
    println(userA.equals(userD))
}

/*data class dataUser2(val nama: String, val umur: Int)

fun main(){
    val userA = dataUser2("Wahyu", 20)
    val userB = dataUser2("Wahyu", 20)
    val userC = dataUser2("Wahyu", 30)
    val userD = dataUser2("Effendi", 20)

    println(userA.equals(userB))
    println(userA.equals(userC))
    println(userA.equals(userD))
}*/