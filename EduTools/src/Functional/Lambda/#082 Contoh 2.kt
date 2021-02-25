fun main(){
    val length = printLength("Hallo Indonesia")
    println("Panjanganya adalah $length")
}

val printLength = { pesan: String -> pesan.length}