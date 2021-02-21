/*
 - List dapat menyimpan banyak data menjadi satu objek
 - List tidak hanya menyimpan dalam bentuk 1 tipe data yang sama
 - List dapat menyimpan data dalam berbagai tipe data seperti Int, String, Boolean
 - List tersebut bersifat immutable alias tidak bisa diubah
 */

fun main(){
    //val numberList : list<Int> = ListOf(1, 2, 3, 4, 5. 6, 7)

    /*
    Karena kompiler bisa mengetahui tipe data yang ada dalam sebuah objek List,
    maka tak perlu kita menuliskannya secara eksplisit.
    Ini tentunya akan menghemat kode yang kita ketikkan.
     */

    val anyList = mutableListOf(1, 2.22, 'A', "Flutter", false)

    anyList.add('d') // menambah item di akhir list
    //anyList.add(1, "love") // menambah item pada indeks ke-1
    anyList[3] = false // mengubah nilai item pada indeks ke-3
    anyList.removeAt(1)

    println(anyList[2])
    print(anyList)     //Cetak Semua List Mutable
}