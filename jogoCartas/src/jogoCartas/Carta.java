package jogoCartas;

public class Carta {
private String cor;
private int numero;

public Carta(String cor, int numero) {
this.cor = cor;
this.numero = numero;
}

public String getCor() {
return cor;
}

public int getNumero() {
return numero;
}

@Override
public String toString() {
return cor + " " + numero;
}
}
