fun main(){
    print("Berapakah Nilai Awalnya : ")
    val awal : Int = readLine()!!.toInt()
    print("Berapakah Nilai Batasnya : ")
    val batas : Int = readLine()!!.toInt()
    print("Berapakah Nilai Pertambahannya : ")
    val pertambahan : Int = readLine()!!.toInt()

    val range = awal.rangeTo(batas) step pertambahan

    for((index, value) in range.withIndex()){
        println("Nilainya $value dan ber-index $index")
    }
}