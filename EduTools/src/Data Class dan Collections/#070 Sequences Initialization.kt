fun main(){
    val nilai = (1..1000000).toList()
    nilai.filter { it % 50 == 0 }.map { it + 1 }.forEach{ println(it) }                //Eager Evaluation
    nilai.asSequence().filter { it % 100 == 0 }.map { it - 1 }.forEach{ println(it) }   //Lazy Evaluation
}