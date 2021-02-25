fun main(){
    val text = "Hai Indonesia"
    val hasil = with(text){
        println("Textnya = $this")
        println("Panjang kalimat = ${this.length}")
        println("Karakter awalnya = ${this[0]}")
        println("Karakter akhirnya = ${this[length-1]}")
    }
}