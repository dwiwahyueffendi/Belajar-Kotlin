fun main(){
    sets(10, 100, nama = "WAHYU")
}

fun sets(vararg totalNilai: Int, nama: String): Int{
    println(nama)
    return totalNilai.sum()
}