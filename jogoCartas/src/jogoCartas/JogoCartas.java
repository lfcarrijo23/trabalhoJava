package jogoCartas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class JogoCartas {
private List<Carta> baralho;
private Jogador jogador1;
private Jogador jogador2;
private Carta cartaMesa;
private static final int MAX_RODADAS = 100; 

public JogoCartas() {
this.baralho = new ArrayList<>();
this.jogador1 = new Jogador();
this.jogador2 = new Jogador();
inicializarBaralho();
embaralharBaralho();
distribuirCartas();
cartaMesa = new Carta("vermelho", 0); 
}

private void inicializarBaralho() {
String[] cores = {"vermelho", "preto", "branco", "azul"};
int[] numeros = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
int cartasPorCor = 50 / cores.length; 

for (String cor : cores) {
for (int i = 0; i < cartasPorCor; i++) {
baralho.add(new Carta(cor, numeros[i % numeros.length]));
}
}


baralho.add(new Carta("vermelho", 0));
baralho.add(new Carta("preto", 1));
}

private void embaralharBaralho() {
Collections.shuffle(baralho, new Random());
}

private void distribuirCartas() {
for (int i = 0; i < 5; i++) { 
jogador1.adicionarCarta(baralho.remove(0));
jogador2.adicionarCarta(baralho.remove(0));
}
}

public void jogar() {
boolean turnoJogador1 = true;
int rodadas = 0;

while (true) {
rodadas++;
if (rodadas > MAX_RODADAS) {
System.out.println("O jogo terminou em empate após " + MAX_RODADAS + " rodadas.");
determinarVencedor();
break;
}

Jogador jogadorAtual = turnoJogador1 ? jogador1 : jogador2;
System.out.println("Carta na mesa: " + cartaMesa);
System.out.println("Mão do jogador " + (turnoJogador1 ? "1" : "2") + ": " + jogadorAtual.getMao());

if (jogadorAtual.temCartaValida(cartaMesa)) {
Carta cartaJogada = jogadorAtual.jogarCarta(cartaMesa);
cartaMesa = cartaJogada;
System.out.println("Jogador " + (turnoJogador1 ? "1" : "2") + " jogou: " + cartaJogada);
} else {
System.out.println("Jogador " + (turnoJogador1 ? "1" : "2") + " não tem carta válida. Passa a vez.");
}

if (jogadorAtual.getMao().isEmpty()) {
System.out.println("Jogador " + (turnoJogador1 ? "1" : "2") + " venceu!");
break;
}

if (baralho.isEmpty()) {
determinarVencedor();
break;
}

turnoJogador1 = !turnoJogador1;
}
}

private void determinarVencedor() {
int cartasJogador1 = jogador1.getMao().size();
int cartasJogador2 = jogador2.getMao().size();

if (cartasJogador1 < cartasJogador2) {
System.out.println("Jogador 1 venceu com menos cartas na mão!");
} else if (cartasJogador2 < cartasJogador1) {
System.out.println("Jogador 2 venceu com menos cartas na mão!");
} else {
int menorCartaJogador1 = jogador1.menorCarta();
int menorCartaJogador2 = jogador2.menorCarta();

if (menorCartaJogador1 < menorCartaJogador2) {
System.out.println("Jogador 1 venceu com a menor carta!");
} else if (menorCartaJogador2 < menorCartaJogador1) {
System.out.println("Jogador 2 venceu com a menor carta!");
} else {
System.out.println("Empate! Ambos os jogadores têm a mesma menor carta.");
}
}
}
}
