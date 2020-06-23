fun main() {
    val baris1 = "baris 1\n" +
            "baris 2\n" +
            "baris 3\n" +
            "baris 4\n"

    val baris2 = """
        baris 1
        baris 2
        baris 3
        baris 4
    """.trimIndent()

    print(baris1)      //Cara Manual
    print(baris2)       //Cara Raw String
}