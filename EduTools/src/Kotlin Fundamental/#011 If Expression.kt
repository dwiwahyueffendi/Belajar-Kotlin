//If Else
/*fun main(){
    val NilaiSaya = 50  //Silahkan di ubah ubah nilainya
    val NilaiStandar = 75
    val Keterangan: String

    if(NilaiSaya > NilaiStandar){
        Keterangan = "Selamat anda lulus kategori tinngi dengan nilai $NilaiSaya"
    }
    else if(NilaiSaya == NilaiStandar){
        Keterangan = "Selamat anda lulus kateogri cukup dengan nilai $NilaiSaya"
    }
    else{
        Keterangan = "Maaf anda belum lulus dengan nilai $NilaiSaya"
    }
    print(Keterangan)
}*/

//If Else Expression
fun main(){
    val NilaiSaya = 80  //Silahkan di ubah ubah nilainya
    val NilaiStandar = 75
    val Keterangan: String

    Keterangan = if(NilaiSaya > NilaiStandar){
        "Selamat anda lulus kategori tinngi dengan nilai $NilaiSaya"
    }
    else if(NilaiSaya == NilaiStandar){
        "Selamat anda lulus kateogri cukup dengan nilai $NilaiSaya"
    }
    else{
        "Maaf anda belum lulus dengan nilai $NilaiSaya"
    }
    print(Keterangan)
}
