fun main(){
    val nilai1 = 20
    val nilai2 = 10

    val hasil1 = tambah(nilai1, nilai2)
    val hasil2 = kurang(nilai1, nilai2)
    val hasil3 = kali(nilai1, nilai2)
    val hasil4 = bagi(nilai1, nilai2)
    val hasil5 = modulus(nilai1, nilai2)

    println(hasil1)
    println(hasil2)
    println(hasil3)
    println(hasil4)
    println(hasil5)
}

fun tambah(nilai1: Int, nilai2: Int) = nilai1 + nilai2
fun kurang(nilai1: Int, nilai2: Int) = nilai1 - nilai2
fun kali(nilai1: Int, nilai2: Int) = nilai1 * nilai2
fun bagi(nilai1: Int, nilai2: Int) = nilai1 / nilai2
fun modulus(nilai1: Int, nilai2: Int) = nilai1 % nilai2