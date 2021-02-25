var pesan = "Java"

fun main() {
    println(::pesan.name)
    println(::pesan.get())

    ::pesan.set("Kotlin")

    println(::pesan.get())
}