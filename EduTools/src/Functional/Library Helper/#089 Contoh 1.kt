/*
standard function library, yaitu sebuah extension functions dari sebuah objek yang menggunakan
lambda sebagai argumen atau yang disebut sebagai higher-order function.

scope function antara lain, let, run, with, apply, dan also.
Pada dasarnya beberapa fungsi tersebut melakukan tugas yang sama yaitu mengeksekusi blok kode
dari dalam sebuah objek. Yang membedakannya adalah bagaimana objek tersebut tersedia dan
seperti apa hasil yang didapat dari seluruh expression yang berada di dalam blok.

Terdapat 2 (dua) cara, yaitu: diakses sebagai lambda receiver (this) dan lambda argumen (it).
Keduanya memiliki kapabilitas yang sama dan tentunya digunakan untuk kasus yang berbeda.

fungsi yang menggunakan lambda receiver adalah run, with, dan apply
 */

fun main(){
    /*val text = "Hello"
    text.let { value ->
        val message = "$value Kotlin"
        println(message)
    }*/

    val text = "Hello"
    text.let {
        val message = "$it Kotlin"
        println(message)
    }
}