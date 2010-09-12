//Script Scala
case class Musica(nome: String, estilo: String)

val rock = new Musica("Metallica", "Rock")
val classica = new Musica("Bach", "Classico")

for (musica <- List(rock, classica)) {
  musica match {
    case Musica("Metallica", "Rock") => println("Metaleiro")
    case Musica("Bach", "Classico") => println("Erudito")
  }
}

