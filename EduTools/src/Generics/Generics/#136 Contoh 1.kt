fun main() {
    val longArrayList = ArrayList<Long>()
    val firstLong = longArrayList[0]
}

class ArrayList<T> : List1<T> {
    override fun get(index: Int): T {
        return this[index]
    }
}

interface List1<T> {
    operator fun get(index: Int): T
}