/*
Exception adalah event (kejadian) yang dapat mengacaukan jalannya suatu program.
Pada Kotlin semua exception bersifat Unchecked, yang artinya exception terjadi
karena kesalahan pada kode kita.

Berikut ini beberapa contoh Unchecked Exception yang sering mengganggu jalannya program kita:
- ArithmeticException merupakan exception yang terjadi karena kita membagi suatu bilangan
dengan nilai nol.
- NumberFormatException disebabkan karena terjadi kesalahan dalam format angka. Sebagai contoh,
kita akan mengubah sebuah nilai String menjadi Integer tetapi nilai String yang akan kita ubah
tidak memiliki format angka yang benar, sehingga dapat membangkitkan NumberFormatException
- NullPointerException atau NPE. Walaupun Kotlin memiliki operator Null Safety,
NPE tetap bisa saja terjadi. NPE terjadi karena sebuah variabel atau objek memiliki nilai null,
padahal seharusnya objek atau variabel tersebut tidak boleh null
*/

//try-catch
fun main() {
    val someNullValue: String? = null
    lateinit var someMustNotNullValue: String

    try {
        someMustNotNullValue = someNullValue!!
        println(someMustNotNullValue)
    } catch (e: Exception) {
        someMustNotNullValue = "Nilai String Null"
        println(someMustNotNullValue)
    }
}