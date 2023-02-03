package front

class Menus {
   def mostrarBemVindo() : Unit = {println("Bem vindo! Este é um projeto de calculadora usado para aprender backend em Scala!")}
   def escolherOperacao() : Unit = {println("Escolha a operacao: \n 1 - Soma\n 2 - Subtracao\n 3 - Divisao\n 4 - Multiplicacao\n 5 - Sair\n Escolha: ")}
   def buscarPrimeiro() : Unit = {println("Digite o primeiro numero: ")}
   def buscarSegundo() : Unit = {println("Digite o segundo numero: ")}
   def despedida() : Unit = {println("Obrigado por testar o sistema!")}
}
