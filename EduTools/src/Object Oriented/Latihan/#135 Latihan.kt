class Cat1(private val name: String) {
    // TODO 1
    var sleep: Boolean = false

        get(){
            println("Fungsi getter dipanggil")
            return field
        }

        set(value){
            println("Fungsi setter dipanggil")
            field = value
        }

    fun toSleep() {
        if(sleep){
            println("$name, sleep!")
        } else {
            println("$name, let's play!")
        }
    }
}

fun main() {

    // TODO 2
    val gippy = Cat1("Gippy")

    gippy.toSleep()
    gippy.sleep = true
    gippy.toSleep()
}