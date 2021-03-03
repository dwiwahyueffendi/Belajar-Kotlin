class Animal2(private var name: String, private val weight: Double, private val age: Int, private val isMammal: Boolean = true) {

    fun getName() = name

    fun setName(newName: String) {
        name = newName
    }
}

fun main() {
    val kucing = Animal2("Miaw", 2.5, 2)

    // dicoding.name <- Cannot access '[PROPERTY]': it is private in 'Animal'
    println(kucing.getName())
    kucing.setName("Gooose")
    println(kucing.getName())
}