package `unidad 3`

fun isHappySunny(mood: String, weather: String, temperature: Int) =
    mood == "happy" && weather == "sunny" && temperature > 20

fun isSadRainyFreezing(mood: String, weather: String, temperature: Int) =
    mood == "sad" && weather == "rainy" && temperature == 0

fun isTooHot(temperature: Int) =
    temperature > 35

fun isEnergeticWarm(mood: String, temperature: Int) =
    mood == "energetic" && temperature > 25

fun isRelaxed(mood: String) =
    mood == "relaxed"

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String =
    when {
        isSadRainyFreezing(mood, weather, temperature) ->
            "Stay in bed"

        isTooHot(temperature) ->
            "Go swimming"

        isHappySunny(mood, weather, temperature) ->
            "Go for a walk"

        isEnergeticWarm(mood, temperature) ->
            "Go to the gym"

        isRelaxed(mood) ->
            "Read a book"

        else ->
            "Stay home and read."
    }

fun main() {
    print("How are you feeling today? ")
    val mood = readLine()!!

    println(whatShouldIDoToday(mood))
}