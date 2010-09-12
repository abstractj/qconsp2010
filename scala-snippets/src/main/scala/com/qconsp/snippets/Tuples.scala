class MilkShake {
  def opcoes(pedido: Any) = {
    ("banana", "maca", "morango")
  }
}
object AskMilkShake {
  def main(args: Array[String]) = {
    val shake = new MilkShake
    val (x, y, z) = shake.opcoes("Tem o que?")

    println(shake.opcoes("Tem o que?"))
    println("Shake: " + x)
    println("Shake: " + y)
    println("Shake: " + z)
  }
}
