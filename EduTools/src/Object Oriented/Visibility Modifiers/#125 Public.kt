class Animal4(val name: String, val weight: Double, val age: Int, val isMammal: Boolean = true)

fun main() {
    val kucing = Animal4("Miiaw", 2.2, 2)
    println(kucing.name)
    println(kucing.weight)
    println(kucing.age)
    println(kucing.isMammal)
}