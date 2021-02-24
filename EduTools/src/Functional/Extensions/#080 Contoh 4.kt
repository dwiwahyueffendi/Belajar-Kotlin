fun main(){
    val nilai: Int? = null
    print(nilai.slice)
}

val Int?.slice: Int
    //get() = if (this == null) 0 else this.div(2)
    get() = this?.div(2) ?: 100