fun main(){
    /*val nilai: String? = null
    nilai?.length   //Safe Call Operator (?.) / Memungkinkan untuk kode aman dari NULLPOINTEREXCEPTION*/

    /*val nilai: String? = null
    val panjangNilai = nilai?.length ?: 7   //Elvis Operator (?:) / Memungkinkan untuk menetapkan default value jika objek bernilai null.
    //val panjangNilai = if (nilai != null) nilai.length else 9 //Metode menggunakan Non Elvis Operator
    print(panjangNilai)*/

    //val nilai: String? = null
    val nilai: String? = "Wahyu"
    val panjangNilai = nilai!!.length   //non null assertion (!!)
    print(panjangNilai)   //Memakasa sebuah object tidak boleh null (sangat tidak di sarankan untuk memakainya
}