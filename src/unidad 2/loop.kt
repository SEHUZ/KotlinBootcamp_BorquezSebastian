package `unidad 2`

fun loop() {
    // array de 11 al 15
    val numbers = arrayOf(11, 12, 13, 14, 15)

    // lista mutable
    val stringList = mutableListOf<String>()

    for (number in numbers) {
        stringList.add(number.toString())
    }

    println(stringList)
}

fun loopChallenge() {
    val lista = mutableListOf<Int>()

    for (i in 0..100) {
        if (i % 7 == 0) {
            lista.add(i)
        }
    }

    println(lista)
}

fun main() {
    loop()
    loopChallenge()
}