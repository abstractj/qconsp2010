val tipos = List(1, "QconSP", 10.2)
  for (tipo <- tipos) {
  tipo match {
    case a: Int => println("Inteiro: " + a)
    case b: String => println("String: " + b)
    case c: Double => println("Double: " + c)
  }
}

