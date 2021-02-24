/*
- Kotlin mendukung 2 (dua) extension yang dapat digunakan,
- yaitu Extension Functions dan Extension Properties.
- Jika extension functions digunakan untuk menambahkan fungsi baru,
- extension properties tentunya digunakan untuk menambahkan sebuah properti baru.
 */

fun main(){
    10.printInt()           //  receiver type
}

fun Int.printInt(){         // receiver type
    println("Nilainya adalah $this")    // receiver type yang bertindak sebagai objek
}