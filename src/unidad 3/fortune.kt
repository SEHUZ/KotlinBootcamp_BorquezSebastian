package `unidad 3`

fun getBirthday(): Int {
    print("Enter your birthday: ")
    return readLine()?.toIntOrNull() ?: 1
}

fun getFortune(birthday: Int): String {
    val fortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )

    return when {
        birthday == 28 || birthday == 31 ->
            "Celebrate responsibly and enjoy your special day 🎉"

        birthday in 1..7 ->
            "A fresh start brings new opportunities."

        else -> fortunes[birthday % fortunes.size]
    }
}

fun main() {
    for (i in 1..10) {
        val fortune = getFortune(getBirthday())
        println("Your fortune is: $fortune")

        if (fortune == "Take it easy and enjoy life!") {
            break
        }
    }
}