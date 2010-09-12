val cores = List("Azul", "Vermelho", "Abobora", "Azul Piscina", "Azul Celeste")
for (cor <- cores
  if cor.contains("Azul")
) println(cor)