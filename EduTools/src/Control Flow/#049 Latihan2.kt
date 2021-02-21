/*Latihan

Lengkapi potongan kode pada program sederhana di samping agar dapat berjalan dengan baik.

TODO 1 :
Perbaiki ekspresi pada kode jika nilai number bernilai genap maka proses iterasi akan dilewatkan.

TODO 2 :
Perbaiki ekspresi pada kode jika nilai number bernilai lebih dari 15 maka proses iterasi akan dihentikan.

TODO 3 :
Lengkapi inisialisasi variable result dengan rumus perhitungan berikut:
number x ( number + 10 )


Jika dijalankan konsol akan menampilkan teks seperti berikut:
range result is 11
range result is 39
range result is 75
range result is 119
range result is 171
range result is 231
range result is 299
range result is 375*/

fun main(){
    val listNumber = 1.rangeTo(100)

    for (number in listNumber) {
        // Jika Genap Maka Lewatkan
        if (number % 2 == 0) continue

        // Jika lebih dari 15 Maka Hentikan
        if (number > 15) break

        // Gunakan Rumus
        val result = number * (number + 10)
        println("range result is $result")
    }
}