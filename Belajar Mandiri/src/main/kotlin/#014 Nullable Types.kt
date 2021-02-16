fun main(){
    //Penulisan Nullable Types
    /*val nilai: String? = null  //Tambahakan ? untuk mencegah NULLPOINTEREXCEPTION
    print(nilai)*/

    //val panjangNilai = nilai.length //Kompilasi Error

    //Pengaksesan / Modifikasi Nullable Types
    val nilai: String? = null

    if(nilai != null){
        val panjangNilai = nilai.length //Kompilasi Berjalan
    }
}
