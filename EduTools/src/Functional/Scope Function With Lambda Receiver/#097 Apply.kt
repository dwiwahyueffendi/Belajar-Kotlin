import java.lang.StringBuilder

fun main(){
    val pesan = StringBuilder().apply {
        append("Hai ")
        append("Indonesia ")
    }

    print(pesan.toString())
}