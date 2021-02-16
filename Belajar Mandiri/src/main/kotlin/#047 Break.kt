fun main(){
    val nilai = listOf(1,2,null,3,4,5,null,7)
    for(i in nilai){
        if(i == null) break
        println(i)
    }
}