/*Latihan

Lengkapi potongan kode pada program sederhana di samping agar dapat berjalan dengan baik.

TODO:
Lengkapi inisialisasi variable result dengan melakukan operasi matematika pada argumen yang diberikan dengan rumus perhitungan berikut:
valueA + (valueB - valueC)
Jika valueC bernilai null berikan 50 untuk nilai defaultnya.

Jika program dijalankan, maka pada konsol akan menampilkan text:
ResultA is 54
ResultB is 103*/

fun main() {

    val valueA = 101
    val valueB = 52
    val valueC = 99

    val resultA = calculateResult(valueA, valueB, valueC)
    val resultB = calculateResult(valueA, valueB, null)

    println("ResultA is $resultA")
    println("ResultB is $resultB")
}

fun calculateResult(valueA: Int, valueB: Int, valueC: Int?): Int {

    val valueC = if (valueC != null) valueC else 50
    val result = valueA + (valueB - valueC)
    return result
}