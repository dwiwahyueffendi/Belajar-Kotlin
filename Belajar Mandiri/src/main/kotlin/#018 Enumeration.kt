/*Enumeration merupakan salah satu fitur yang bisa kita gunakan untuk menyimpan kumpulan objek
yang telah didefinisikan menjadi tipe data konstanta.
Enumeration dapat ditetapkan sebagai nilai ke dalam sebuah variabel dengan cara yang lebih efisien.
Selain itu, Enumeration juga dapat digunakan untuk meminimalisir kesalahan dalam pengetikan nilai sebuah variabel.*/

fun main(){
    val warna : Warna = Warna.Hijau
    print(warna)
}

enum class Warna{
    Merah, Hijau, Kuning, Biru
}
