fun main(){
    val index = listOf(1,2,9)
    val nilai = listOf(1,2,3,4,5,6,7,8,9,10)
    val sliceNilai = nilai.slice(1..3)
    //val sliceNilai = nilai.slice(1..7 step 2)
    //val sliceNilai = nilai.slice(index)

    print(sliceNilai)
}