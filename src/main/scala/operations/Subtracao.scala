package operations

class Subtracao extends Operation {
  override def calculo(primeiroNumero: Int, segundoNumero: Int): Unit = {
    println("O resultado de " + primeiroNumero + " - " + segundoNumero + " é igual a " + (primeiroNumero - segundoNumero))
  }
}
