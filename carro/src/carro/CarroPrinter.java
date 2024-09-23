package carro;

//Classe responsável por exibir as informações do carro
public class CarroPrinter {
 public void exibirVelocidadeAtual(Carro carro) {
     System.out.println("A velocidade atual do carro é: " + carro.getVelocidadeAtual() + " km/h");
 }
}
