//Source Code Improvisation By Dwi Wahyu

fun main() {
    val stringResult = getResult("Kotlin")
    val intResult = getResult(100)

    // Cetak Nilai
    println("String result: $stringResult")
    println("Int result: $intResult")
}

// Menambahkan Fungsi Generic
fun <T> getResult(args: T): Int {
    return when (args) {
        is Int -> args * 5
        is String -> args.length
        else -> 0
    }
}