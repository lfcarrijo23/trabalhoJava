package jogoCartas;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
private List<Carta> mao;

public Jogador() {
this.mao = new ArrayList<>();
}

public List<Carta> getMao() {
return mao;
}

public void adicionarCarta(Carta carta) {
mao.add(carta);
}

public void removerCarta(Carta carta) {
mao.remove(carta);
}

public boolean temCartaValida(Carta cartaMesa) {
for (Carta carta : mao) {
if (carta.getCor().equals(cartaMesa.getCor()) || carta.getNumero() == cartaMesa.getNumero()) {
return true;
}
}
return false;
}

public Carta jogarCarta(Carta cartaMesa) {
for (Carta carta : mao) {
if (carta.getCor().equals(cartaMesa.getCor()) || carta.getNumero() == cartaMesa.getNumero()) {
removerCarta(carta);
return carta;
}
}
return null;
}

public int menorCarta() {
int menor = Integer.MAX_VALUE;
for (Carta carta : mao) {
if (carta.getNumero() < menor) {
menor = carta.getNumero();
}
}
return menor;
}
}
