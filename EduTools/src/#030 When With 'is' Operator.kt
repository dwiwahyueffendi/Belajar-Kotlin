fun main(){
    val minyak : Any = 100L
    when(minyak){
        is Int -> print("Ini Tipe Data Integer")
        is String -> print("Ini Tipe Dat String")
        //is Long -> print("Ini Tipe Data Long")
        else -> print("Tidak Terdefinisi")
    }
}
