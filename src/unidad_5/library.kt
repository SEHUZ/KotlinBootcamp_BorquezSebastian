package unidad_5

fun main(args: Array<String>) {
    val allBooks = setOf(
        "Hamlet",
        "Macbeth",
        "Othello",
        "Romeo and Juliet"
    )

    val library = mapOf(
        "William Shakespeare" to allBooks
    )

    val hasHamlet = library.any { entry ->
        entry.value.contains("Hamlet")
    }

    val moreBooks = mutableMapOf(
        "Clean Code" to "Robert C. Martin"
    )

    val author = moreBooks.getOrPut("The Pragmatic Programmer") {
        "Andrew Hunt & David Thomas"
    }

    println("Author: $author")

    println(moreBooks)
}

