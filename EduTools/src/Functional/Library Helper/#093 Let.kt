/*
Fungsi let menggunakan argumen (it) untuk mengakses konteks dari sebuah objek.
Penggunaan fungsi let akan banyak kita temukan pada objek yang bertipe non-null.
 */

fun main(){
    val pesan: String? = null
    pesan?.let{
        val panjang = it.length * 2
        val text = "Text panjangnya $panjang"
        print(text)
    }?: run {
        val text = "Pesan Kosong"
        println(text)
    }
}