fun main(){
    print("Berapa Batas Loopingnya : ")
    val nilai : Int = readLine()!!.toInt()
    val range = 1..nilai

    for(i in range){
        println("Hello World $i")
    }
}