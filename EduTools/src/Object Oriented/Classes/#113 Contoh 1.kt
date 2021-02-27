class Person(
    val nama : String,
    val umur : Int,
    val alamat : String,
    val jenisKelamin : String){

    fun makan(){
        println("$nama sedang makan")
    }

    fun berjalan(){
        print("$nama sedang berjalan")
    }
}

fun main(){
    val dataPerson = Person("Budi", 20, "Surabaya", "Laki Laki")
    println("Nama : ${dataPerson.nama},\nUmur : ${dataPerson.umur},\nAlamat : ${dataPerson.alamat},\nJenis Kelamin : ${dataPerson.jenisKelamin} ")
    dataPerson.makan()
    dataPerson.berjalan()
}