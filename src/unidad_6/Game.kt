package unidad_6

class Game {
    public val location = Location()

    // lambdas para direccion
    public val north = { location.move(0, -1) }
    public val south = { location.move(0, 1) }
    public val east = { location.move(1, 0) }
    public val west = { location.move(-1, 0) }
    public val end = { println("Game over"); false }

    fun move(where: () -> Boolean) {
        where.invoke()
        println(location.description())
    }

    fun makeMove(direction: String?) {
        when (direction?.lowercase()) {
            "n" -> move(north)
            "s" -> move(south)
            "e" -> move(east)
            "w" -> move(west)
            else -> move(end)
        }
    }
}


//fun main() {
//    val game = Game()
//
//    println(game.path)
//
//    game.north()
//    game.south()
//    game.east()
//    game.west()
//    game.end()
//
//    println(game.path)
//}

fun main() {
    val game = Game()

    while (true) {
        print("Enter a direction: n/s/e/w: ")
        val input = readLine()
        game.makeMove(input)
    }
}