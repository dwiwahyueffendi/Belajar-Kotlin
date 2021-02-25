/*
- Lambda expression, biasa disebut dengan anonymous function atau function literal
- Karakteristik Lambda :
- Dalam menggunakan lambda, kita tidak perlu mendeklarasi tipe spesifik untuk nilai kembaliannya.
Tipe tersebut akan ditentukan oleh kompiler secara otomatis.
- Walaupun merupakan sebuah fungsi, lambda tidak membutuhkan kata kunci fun dan visibility modifier
saat dideklarasikan, karena lambda bersifat anonymous.
- Parameter yang akan ditetapkan berada di dalam kurung kurawal {}.
- Ketika ingin mengembalikan nilai, kata kunci return tidak diperlukan lagi
karena kompiler akan secara otomatis mengembalikan nilai dari dalam body.
- Lambda expression dapat digunakan sebagai argumen untuk sebuah parameter dan
dapat disimpan ke dalam sebuah variabel.
 */

fun main(){
    printPesan("Hallo Indonesia")
}

val printPesan = { pesan: String -> print(pesan)}