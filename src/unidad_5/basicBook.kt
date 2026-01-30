package unidad_5

import kotlin.random.Random

const val MAX_BORROWED_BOOKS = 5

class basicBook(val title: String, val author: String, val year: Int, var pages: Int) {

    fun canBorrow(currentlyBorrowed: Int): Boolean { //metodo nuevo
        return currentlyBorrowed < MAX_BORROWED_BOOKS
    }

    fun titleAndAuthor(): Pair<String, String> {
        return Pair(title, author)
    }

    fun titleAuthorAndYear(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }

    companion object {
        const val BASE_URL = "https://library.example.com/books/"
    }

    fun printUrl() {
        val url = "$BASE_URL${title.replace(" ", "_")}.html"
        println(url)
    }
}

fun basicBook.weight(): Double {
    return pages * 1.5
}

fun basicBook.tornPages(torn: Int) {
    pages = (pages - torn).coerceAtLeast(0)
}

class Puppy {

    fun playWithBook(book: basicBook) {
        val tornPages = Random.nextInt(1, 10)
        book.tornPages(tornPages)
        println("Puppy tore $tornPages pages! Pages left: ${book.pages}")
    }
}


//fun main() {
//    val book = basicBook(
//        title = "Libro loco",
//        author = "Sebas",
//        year = 2020
//    )
//
//    val (title, author) = book.titleAndAuthor()
//    println("Title: $title, Author: $author")
//
//    val (bookTitle, bookAuthor, bookYear) = book.titleAuthorAndYear()
//    println("Here is your book $bookTitle written by $bookAuthor in $bookYear.")
//
//    println("Can borrow more books? ${book.canBorrow(3)}")
//    book.printUrl()
//}

fun main() {
    val book = basicBook(title = "perro2", author = "locis", year = 2025, pages = 50)

    val puppy = Puppy()

    while (book.pages > 0) {
        puppy.playWithBook(book)
        println("Book weight: ${book.weight()} grams\n")
    }

    println("The book has no more pages left!")
}

