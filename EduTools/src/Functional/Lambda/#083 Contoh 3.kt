/*
- Higher-Order Function, yaitu sebuah fungsi yang menggunakan fungsi lainnya sebagai parameter,
- menjadikan tipe kembalian, ataupun keduanya
 */

fun main(){
    printResult(20){ value ->
        value + value
    }
}

fun printResult(value: Int, sum: (Int) -> Int){
    val result = sum(value)
    print(result)
}