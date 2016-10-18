import lab._

val books: List[Book] = List(
  Book (title = "Thinking Functionally with Haskell", authors =  List("Bird, Richard")),
  Book (title = "Structure and Interpretation of Computer Programs",
    authors = List("Abelson, Harald", "Sussman, Gerald J.")),
  Book (title = "Introduction to Functional Programming",
    authors = List("Bird, Richard")),
  Book (title = "Programming in Scala",
    authors =  List("Odersky, Martin", "Spoon, Lex", "Venners, Bill")))

for {
  book <- books;
  author <- book.authors
  if author.contains("Odersky")
} yield book.title




books.head.authors.contains("Bird, Richard")


"this is a string".contains("is")
