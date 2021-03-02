class hewan{
    var suara : String = "Meonggg"
    get(){
        println("Fungsi Getter Terpanggil")
        return field
    }
    set(value){
        println("Fungsi Setter Terpanggil")
    }
}

fun main(){
    val kucing = hewan()
    println("${kucing.suara}")
    kucing.suara = "Miaww"
    println("${kucing.suara}")
}