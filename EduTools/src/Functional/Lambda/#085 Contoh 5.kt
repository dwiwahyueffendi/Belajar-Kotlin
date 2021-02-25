fun main() {
    val message = buildString {
        append("Dwi ")
        append("Wahyu ")
        append("Effendi ")
    }

    println(message)
}

fun buildString(action: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}