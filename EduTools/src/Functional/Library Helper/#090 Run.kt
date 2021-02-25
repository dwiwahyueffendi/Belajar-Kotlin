/*
Fungsi run akan mengembalikan nilai berdasarkan expression yang berada di dalam blok lambda.
Untuk mengakses konteks dari objek, ia akan menggunakan receiver (this).
Fungsi run akan sangat berguna jika di dalam blok lambda terdapat inisialisasi objek dan
perhitungan untuk nilai kembalian.
 */

fun main(){
    val text = "Surabaya"
    val hasil = text.run{
        val from = this
        val to = this.replace("Surabaya", "Jakarta")
        println("Dari $from ke $to")
    }
}