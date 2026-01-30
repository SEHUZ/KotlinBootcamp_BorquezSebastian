package unidad_4

class Spice(val name: String, val spiciness: String = "mild") {
    val heat: Int
        get() = when (spiciness) {
            "mild" -> 5
            "medium" -> 7
            "spicy" -> 10
            "very spicy" -> 15
            else -> 0
        }

    init {
        println("Spice created: $name | Spiciness: $spiciness | Heat: $heat")
    }

}

fun makeSalt(): Spice {
    return Spice("Salt", "not spicy")
}

fun main() {

    val spices = listOf(
        Spice("Curry", "mild"),
        Spice("Pepper", "medium"),
        Spice("Cayenne", "spicy"),
        Spice("Ginger", "mild"),
        Spice("Chili", "very spicy"),
        makeSalt()
    )

    // Filtrar especias picantes o menos
    val mildSpices = spices.filter { it.heat <= 7 }

    println("\nMild or less spicy spices:")
    mildSpices.forEach {
        println("${it.name} (heat ${it.heat})")
    }
}
