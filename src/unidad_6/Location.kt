package unidad_6

class Location(private val width: Int = 4, private val height: Int = 4) {

    private val map = Array(width) { arrayOfNulls<String>(height) }
    private var x = 0
    private var y = 0

    init {
        map[0][0] = "Estas en el spawn."
        map[0][1] = "Ves una casa."
        map[0][2] = "Avanzas a la casa."
        map[0][3] = "Encuentras un perro."

        map[1][0] = "Estas con tu amigo."
        map[1][1] = "Ves pajaros a lo lejos."
        map[1][2] = "Caminas sin rumbo."
        map[1][3] = "Encuentras un bosque."

        map[2][0] = "Estas en la calle."
        map[2][1] = "Aparece una persona."
        map[2][2] = "Te haces su amigo."
        map[2][3] = "Viajan juntos."

        map[3][0] = "Estas en un campo."
        map[3][1] = "Escuchas animales."
        map[3][2] = "Ves un caballo."
        map[3][3] = "Consigues un nuevo amigo."
    }

    fun move(dx: Int, dy: Int): Boolean {
        x = (x + dx).coerceIn(0, width - 1)
        y = (y + dy).coerceIn(0, height - 1)
        return true
    }

    fun description(): String {
        return map[x][y] ?: "Nothing interesting here."
    }
}