package application

import front.Menus
import operations.{Divisao, Multiplicacao, Soma, Subtracao}

import scala.sys.exit

object Main extends App {
  val menu = new Menus
  menu.mostrarBemVindo()
  var digitado = 0
  while (digitado <= 4){
    menu.escolherOperacao()
    digitado = scala.io.StdIn.readInt()
    if(digitado <=4 && digitado >= 1){
      menu.buscarPrimeiro()
      val primerio = scala.io.StdIn.readInt()
      menu.buscarSegundo()
      val segundo = scala.io.StdIn.readInt()
      if (digitado == 1) {
        val soma = new Soma
        soma.calculo(primerio, segundo)
      } else if (digitado == 2) {
        val sub = new Subtracao
        sub.calculo(primerio, segundo)
      } else if (digitado == 3) {
        val divisao = new Divisao
        divisao.calculo(primerio, segundo)
      } else if (digitado == 4) {
        val multiplicacao = new Multiplicacao
        multiplicacao.calculo(primerio, segundo)
      }
    }
  }
  menu.despedida()
  exit
}
