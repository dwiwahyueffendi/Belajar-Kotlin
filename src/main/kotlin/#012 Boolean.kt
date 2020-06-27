fun main(){
    val buka = 8
    val tutup = 20
    val sekarang =24

    //Conjuction (Operator &&)
    /*val keterangan = if(sekarang >= buka && sekarang <= tutup){
        "Sekarang Toko Masih Buka"
    }
    else{
        "Sekarang Toko Sedang Tutup"
    }
    print(keterangan)*/

    //Disjunction (Operator ||)
    /*val keterangan = if(sekarang >= buka || sekarang <= tutup){
        "Sekarang Toko Masih Buka"
    }
    else{
        "Sekarang Toko Sedang Tutup"
    }
    print(keterangan)*/

    //Negation (Operator !)
    val keterangan = sekarang >= buka
    if(!keterangan){
        print("Sekarang Toko Masih Buka")
    }
    else{
        print("Sekarang Toko Sedang Tutup")
    }

}
