fun main(){
    print("Masukkan Batas (Max) : ")
    val max : Int = readLine()!!.toInt()
    print("Masukkan Batas (Min) : ")
    val min : Int = readLine()!!.toInt()
    print("Masukkan Nilai Pengurangannya : ")
    val pengurangannya : Int = readLine()!!.toInt()
    print("Masukan Nilai Yang Di Cocokan : ")
    val cari : Int = readLine()!!.toInt()

    val range = max.downTo(min) step pengurangannya

    if(cari in range){
        print("Nilai $cari berada dalam jangkauan")
    }
    else if(cari !in range){
        print("Nilai $cari tidak berada dalam jangkauan")
    }
    else{
        print("Nilai Tidak Terdefinisi")
    }

}