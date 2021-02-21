fun main() {
    val intArray = intArrayOf(1, 3, 5, 7)  // [1, 3, 5, 7]
    print(intArray[2])  //Sebelum Update

    print("\n")

    intArray[2] = 11 // [1, 3, 11, 7]
    print(intArray[2])  //Setelah Update
}