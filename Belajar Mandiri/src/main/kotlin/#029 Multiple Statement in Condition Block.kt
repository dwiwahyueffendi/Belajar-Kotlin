fun main(){
    val angka = 4

    val stringofvalue = when(angka){
        1 -> {
            println("Nilainya adalah 1")
            "Satu"
        }
        2 -> {
            println("Nilainya adalah 2")
            "Dua"
        }
        3 -> {
            println("Nilainya adalah 3")
            "Tiga"
        }
        4 -> {
            println("Nilainya adalah 4")
            "Empat"
        }
        5 -> {
            println("Nilainya adalah 5")
            "Lima"
        }
        else -> {
            println("Nilai Tidak Di Temukan")
        }
    }

    println(stringofvalue)
}
