package `unidad 3`

val rollDice = { sides: Int -> if (sides == 0) 0 else (1..sides).random() }

val rollDice2: (Int) -> Int = { sides ->
    if (sides == 0) 0 else (1..sides).random()
}

//1. a veces es mejor usar function type notation porque el tipo es explicito, no implicito por lo que no siempre queda claro
// que tipo de dato recibe y devuelve una funcion

fun gamePlay(diceRoll: (Int) -> Int) {
    val roll = diceRoll(12)
    println("You rolled a $roll")
}


fun main () {
    println(rollDice(12))
    println(rollDice2(24))
    gamePlay(rollDice2)
}