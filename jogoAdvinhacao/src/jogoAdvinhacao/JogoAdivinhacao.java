package jogoAdvinhacao;

import java.util.Random;

public class JogoAdivinhacao {
private int numeroAleatorio;
private int tentativas;

public JogoAdivinhacao() {
Random random = new Random();
this.numeroAleatorio = random.nextInt(20) + 1; 
this.tentativas = 0;
}

public String verificarPalpite(int palpite) {
tentativas++;
if (palpite < numeroAleatorio) {
return "O número é maior.";
} else if (palpite > numeroAleatorio) {
return "O número é menor.";
} else {
return "Parabéns! Você adivinhou o número em " + tentativas + " tentativas.";
}
}

public int getTentativas() {
return tentativas;
}

public int getNumeroAleatorio() {
return numeroAleatorio;
}
}