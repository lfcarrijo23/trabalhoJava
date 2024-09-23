package triangulo;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Digite o primeiro lado:");
double lado1 = scanner.nextDouble();

System.out.println("Digite o segundo lado:");
double lado2 = scanner.nextDouble();

System.out.println("Digite o terceiro lado:");
double lado3 = scanner.nextDouble();

Triangulo triangulo = new Triangulo(lado1, lado2, lado3);

if (triangulo.verificarTriangulo()) {
double area = triangulo.calcularArea();
System.out.println("A área do triângulo é: " + area);
} else {
System.out.println("Os lados fornecidos não formam um triângulo válido.");
}

scanner.close();
}
}