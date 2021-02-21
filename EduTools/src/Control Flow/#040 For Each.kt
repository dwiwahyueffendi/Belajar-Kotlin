fun main(){
    print("Berapa Nilai Awalnya : ")
    val awal : Int = readLine()!!.toInt()
    print("Berapa Batas Loopingnya : ")
    val batas : Int = readLine()!!.toInt()
    print("Berapa Nilai Pertambahannya : ")
    val pertambahan : Int = readLine()!!.toInt()

    val range = awal.rangeTo(batas) step pertambahan

    range.forEach(){
        i -> println("Hello World $i")
    }
}