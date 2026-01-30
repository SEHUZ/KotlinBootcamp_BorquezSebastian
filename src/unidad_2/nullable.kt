package unidad_2

fun nulos () {
    // int nulo
    var nullTest: Int? = null

    // verificar null
    val esnulo = (nullTest?.plus(1)) ?: 0


    println(esnulo)
}

fun main(args: Array<String>) {
    nulos()
}