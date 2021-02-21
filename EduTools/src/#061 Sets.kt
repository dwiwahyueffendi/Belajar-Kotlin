/*
- Set merupakan sebuah collection yang hanya dapat menyimpan nilai yang unik.
- Ini akan berguna ketika Anda menginginkan tidak ada data yang sama
- atau duplikasi dalam sebuah collection
- Pada Set kita bisa menambah dan menghapus item
- namun tak bisa mengubah nilai seperti pada List.
*/

fun main(){
    val setA = setOf(1, 2, 3, 2, 1)    //Nilai Unik 1 2 3
    val setB = setOf(1, 3, 2, 2, 1)
    val setC = mutableSetOf(1, 4, 7, 3, 1)      //Mutable digunakan untuk Menambah dan Menghapus Nilai

    println(setA)
    println(setA == setB)     //Nilai unik yang di bandingkan
    println(setA == setC)
    println(3 in setC)        //Mengecek Nilai
    println(6 in setC)

    println(setA.union(setC))//Union = Gabungan
    println(setB.intersect(setC))//Intersect = Irisan

    setC.add(100)
    setC.remove(1)
    println(setC)
}