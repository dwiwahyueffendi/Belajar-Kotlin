fun main(){
    print("Masukkan Nilai Awalnya : ")
    val awal : Int = readLine()!!.toInt()
    print("Masukkan Batas Nilainya : ")
    val batas : Int = readLine()!!.toInt()
    print("Masukkan Nilai Pertambahannya : ")
    val pertambahannya : Int = readLine()!!.toInt()

    val range = awal.rangeTo(batas) step pertambahannya

    range.forEach{
        print("$it ")
    }
}