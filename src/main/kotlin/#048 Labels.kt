fun main(){
    for(x in 1..2){
        println("A")

    loop@ for(y in 1..3){
        println("B")

    for(z in 1..4){
        println("C")
        if(z > 2) break@loop
    }}}
}