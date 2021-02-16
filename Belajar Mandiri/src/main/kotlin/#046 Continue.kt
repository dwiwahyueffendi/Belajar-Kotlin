fun main(){
    val nilai = listOf(1,2,3,4,5,6,null,7,8,null,9)
    for(i in nilai){
        if(i == null) continue
        println(i)
    }
}