//vararg menyederhanakan beberapa parameter yang memiliki tipe data yang sama
//Menjadi parameter tunggal.

fun main(){
    val totalNilai = sumNilai(10, 20, 30, 40)
    print(totalNilai)
}

fun sumNilai(vararg totalNilai: Int): Int{
    return totalNilai.sum()
}