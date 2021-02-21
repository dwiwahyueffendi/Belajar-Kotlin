fun main(){
    val ibuKota = listOf("Jakarta", "Moskot", "Abu Dhabi", "Kuala Lumpur", "London")
    val sortIbuKota = ibuKota.sorted()              //Ascending
    val descIbuKota = ibuKota.sortedDescending()    //Descending

    println(sortIbuKota)
    println(descIbuKota)
}