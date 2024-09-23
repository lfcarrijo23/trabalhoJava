package carro;

//Classe responsável por gerenciar as ações do carro (acelerar e frear)
public class CarroAcoes {
 public void acelerar(Carro carro, int incremento) {
     int novaVelocidade = carro.getVelocidadeAtual() + incremento;
     carro.setVelocidadeAtual(novaVelocidade);
     System.out.println("O carro acelerou. Nova velocidade: " + carro.getVelocidadeAtual() + " km/h");
 }

 public void frear(Carro carro, int decremento) {
     int novaVelocidade = carro.getVelocidadeAtual() - decremento;
     if (novaVelocidade < 0) {
         novaVelocidade = 0; // A velocidade não pode ser negativa
     }
     carro.setVelocidadeAtual(novaVelocidade);
     System.out.println("O carro freou. Nova velocidade: " + carro.getVelocidadeAtual() + " km/h");
 }
}
