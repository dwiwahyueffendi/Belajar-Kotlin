fun main(){
    val bilangan = 1..50
    val bilanganGenap = bilangan.filter(Int::isBilanganGenap)
    print(bilanganGenap)
}

fun Int.isBilanganGenap() = this % 2 == 0