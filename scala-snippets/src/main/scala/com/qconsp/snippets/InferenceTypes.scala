class InferenceTypes {
  val x = 1 + 3 * 6 
  val y = x.toString 

  def calcula(valor: Int) = {
    "Valor: " + x + y + valor    
  }
  def naoFazNada {
    println("Faco nada nao")
  }
}
object RunInferenceTypes{
  def main(args: Array[String]) = {

    val infer = new InferenceTypes
    println(infer.calcula(4))
    println("Vazio" + infer.naoFazNada)
    println("X: " + infer.x)
    println("Y: " + infer.y)
  }
}

