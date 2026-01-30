package unidad_4

open class book (var title: String, var author: String) {
    private var currentPage: Int = 0

    open fun readPage() {
        currentPage++
    }
}

class eBook(title: String, author: String, val format: String = "text") : book(title, author) {
    private var wordCount: Int = 0

    override fun readPage() {
        wordCount += 250
    }
}