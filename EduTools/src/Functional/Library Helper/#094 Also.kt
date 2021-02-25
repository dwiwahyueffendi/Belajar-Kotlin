/*
Fungsi also sama seperti fungsi apply, di mana nilai yang dikembalikan adalah nilai dari konteks objek.
Namun untuk konteks objeknya tersedia sebagai argumen (it).
Fungsi also baiknya digunakan ketika kita ingin menggunakan konteks dari objek sebagai argumen
tanpa harus mengubah nilainya.
 */

fun main(){
    val text = "Hai Indonesia"
    val hasil = text.also {
        println("Panjangnya = ${text.length}")
    }

    println("Textnya = $hasil")
}