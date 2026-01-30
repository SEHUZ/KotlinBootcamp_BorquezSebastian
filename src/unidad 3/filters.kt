package `unidad 3`

fun main () {
    val spices = listOf(
        "curry",
        "pepper",
        "cayenne",
        "ginger",
        "red curry",
        "green curry",
        "red pepper"
    )

    //que contengan curry ordenados por longitud
    val curriesSorted = spices
        .filter { it.contains("curry") }
        .sortedBy { it.length }

    println(curriesSorted)

    //empieza con c y termina con e
    val cAndE1 = spices.filter {
        it.startsWith("c") && it.endsWith("e")
    }

    println(cAndE1)

    //3 primeros elementos que empiecen con C
    val firstThreeC = spices
        .take(3)
        .filter { it.startsWith("c") }

    println(firstThreeC)
}