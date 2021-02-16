fun main() {
    val user = setUser("Dwi Wahyu", 20)
    println(user)

    printUser("Wahyu")
}

fun setUser(name: String, age: Int) = "Your name is $name, and you $age years old"  //Expression Body

fun printUser(name: String) {
    println("Your name is $name")
}