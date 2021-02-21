/*
- Map yakni sebuah collection yang dapat menyimpan data dengan format key-value.
- Sebelah kiri to = key (Tidak bisa di ubah)
- Sebelah kanan to = value (Bisa di ubah)
*/

fun main(){
    val ibuKota = mapOf(
        "Jakarta" to "Indonesia",
        "Tokyo" to "Japan",
        "Seoul" to "Korea"
    )

    println(ibuKota["Jakarta"])             //Indexing
    println(ibuKota.getValue("Seoul"))  //getValue

    //Jika nilai tidak ditemukan
    println(ibuKota["Bangkok"])             //null
    //println(ibuKota.getValue("Bangkok"))  //Exception

    //fungsi keys() untuk menampilkan keys dalam maps
    val mapKeys = ibuKota.keys
    println(mapKeys)

    //fungsi values() untuk menampilkan value dalam maps
    val valueKeys = ibuKota.keys
    println(valueKeys)

    //===================================================
    val mutableIbuKota = ibuKota.toMutableMap()     //Map bisa dirubah
    mutableIbuKota.put("Moskow", "Rusia")           //Menambahkan data map
    mutableIbuKota.put("Beijing", "China")
    println(mutableIbuKota)
}