package unidad_4.spcies

sealed class Spice(val name: String, val spiciness: String = "mild", color: SpiceColor) : SpiceColor by color {

    abstract fun prepareSpice()

    val heat: Int
        get() = when (spiciness) {
            "mild" -> 5
            "medium" -> 7
            "hot" -> 10
            else -> 0
        }
}