val lista1 = List(1, 3, 23, 90)
val lista2 = List(4, 18, 52, 7)

for (l <- List(lista1, lista2)) {
  l match {
    case List(_, 3, _, _) => println("3 encontrado")
    case List(_, _, _, 7) => println("7 encontrado")
  }
}

