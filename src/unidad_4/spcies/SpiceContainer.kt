package unidad_4.spcies

data class SpiceContainer(val spice: Spice) {
    val label: String
        get() = spice.name
}

fun main() {
    val curryMild = Curry("mild")
    val curryHot = Curry("hot")

    val container1 = SpiceContainer(curryMild)
    val container2 = SpiceContainer(curryHot)

    println(container1.label)
    println(container2.label)
}