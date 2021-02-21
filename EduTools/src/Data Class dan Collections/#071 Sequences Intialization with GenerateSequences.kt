fun main() {
    val sequenceNumber = generateSequence(1) { it + 3 }
    sequenceNumber.take(100).forEach { print("$it ") }
}