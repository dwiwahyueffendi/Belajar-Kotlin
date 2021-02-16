import kotlin.random.Random

fun main(){
    val registerNumber = when(val register = getRegisterNumber()){
        in 1..50 -> register * 2
        in 51..100 -> register * 100
        else -> register
    }
    println(registerNumber)
}

fun getRegisterNumber() = Random.nextInt(200)