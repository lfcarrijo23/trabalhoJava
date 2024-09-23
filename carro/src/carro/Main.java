package carro;

//Classe principal para executar o programa
public class Main {
 public static void main(String[] args) {
     Carro carro = new Carro("Toyota", "Corolla");
     CarroAcoes acoes = new CarroAcoes();
     CarroPrinter printer = new CarroPrinter();

     acoes.acelerar(carro, 20); // Acelerar o carro em 20 km/h
     printer.exibirVelocidadeAtual(carro); // Exibir a velocidade atual

     acoes.frear(carro, 10); // Frear o carro em 10 km/h
     printer.exibirVelocidadeAtual(carro); // Exibir a velocidade atual
 }
}
