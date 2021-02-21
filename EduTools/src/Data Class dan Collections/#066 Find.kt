fun main(){
    val nilai = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val findNilai = nilai.find { it % 2 == 0 }          //Disimpan ketika di temukan
    val findNilai1 = nilai.firstOrNull{ it % 2 == 1}    //Sama dengan find (default first)
    val findNilai2 = nilai.lastOrNull { it % 3 == 0}    //Kembalikan dari find / firstOrNull
    val findNilai3 = nilai.find { it % 11 == 0 }        //Jika tidak ditemukan bernilai null

    println(findNilai)
    println(findNilai1)
    println(findNilai2)
    println(findNilai3)
}