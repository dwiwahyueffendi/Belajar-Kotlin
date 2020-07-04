fun main(){
    val angka = 4

    val stringofvalue = when(angka){
        1 -> print("Nilainya adalah 1")
        2 -> print("Nilainya adalah 2")
        3 -> print("Nilainya adalah 3")
        4 -> print("Nilainya adalah 4")
        5 -> print("Nilainya adalah 5")
        else -> print("Nilai Tidak Di Temukan")
    }

    println(stringofvalue)
}
