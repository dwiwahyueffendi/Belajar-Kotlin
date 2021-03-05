import kotlin.reflect.KProperty

class DelegateName {
    private var value: String = "Default"

    operator fun getValue(classRef: Any?, property: KProperty<*>) : String {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: String){
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

class Animal5 {
    var name: String by DelegateName()
}

class Person5 {
    var name: String by DelegateName()
}

class Hero5 {
    var name: String by DelegateName()
}

fun main() {
    val animal = Animal5()
    animal.name = "Dicoding Miaw"
    println("Nama Hewan: ${animal.name}")

    val person = Person5()
    person.name = "Dimas"
    println("Nama Orang: ${person.name}")

    val hero = Hero5()
    hero.name = "Gatotkaca"
    println("Nama Pahlawan: ${hero.name}")
}