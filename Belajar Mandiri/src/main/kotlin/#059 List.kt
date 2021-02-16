/*
 - List dapat menyimpan banyak data menjadi satu objek
 - List tidak hanya menyimpan dalam bentuk 1 tipe data yang sama
 - List dapat menyimpan data dalam berbagai tipe data seperti Int, String, Boolean
 */

class User

fun main(){
    //val numberList : list<Int> = ListOf(1, 2, 3, 4, 5. 6, 7)

    /*
    Karena kompiler bisa mengetahui tipe data yang ada dalam sebuah objek List,
    maka tak perlu kita menuliskannya secara eksplisit.
    Ini tentunya akan menghemat kode yang kita ketikkan.
     */

    val numberList = listOf(1, 2, 3, 4, 5, 6, 7)
    val floatList = listOf(1.11, 2.22, 3.33)
    val charList = listOf('A', 'B', 'C', 'D', 'E')
    val stringList = listOf("Kotlin", "Java", "Flutter")
    val booleanList = listOf(true, false)
    val anyList = listOf(1, 2.22, 'A', User(), "Flutter", false)

    println(numberList[2])
    println(floatList[1])
    println(charList[0])
    println(stringList[1])
    println(booleanList[0])
    println(anyList[4])
    //println(anyList[6])     //Karena index array dimulai dari 0
}