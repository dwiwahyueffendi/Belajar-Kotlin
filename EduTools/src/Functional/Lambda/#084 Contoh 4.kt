fun main(){
    printResult1(30, sum)
}

fun printResult1(value: Int, sum: (Int) -> Int){
    val result = sum(value)
    print(result)
}

var sum: (Int) -> Int = {value -> value + value}