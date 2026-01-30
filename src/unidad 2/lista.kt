package `unidad 2`

fun listas () {
    //lista dos nulos
    val list1: List<String?> = listOf(null, null)

    // lista dos nulos 2
    val list2 = mutableListOf<String?>()
    list2.add(null)
    list2.add(null)

    // lista lista nula
    val list3: List<String>? = null
}

fun main(args: Array<String>) {
    listas()
}