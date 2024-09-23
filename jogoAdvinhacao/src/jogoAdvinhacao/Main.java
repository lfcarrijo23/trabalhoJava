package jogoAdvinhacao;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
JogoAdivinhacao jogo = new JogoAdivinhacao();
Scanner scanner = new Scanner(System.in);
int palpite = 0;
String resultado;


System.out.println("Tente adivinhar o número entre 1 e 20.");

do {
System.out.print("Digite seu palpite: ");
palpite = scanner.nextInt();
resultado = jogo.verificarPalpite(palpite);
System.out.println(resultado);
} while (!resultado.startsWith("Parabéns"));

scanner.close();
}
}