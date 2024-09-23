package triangulo;

public class Triangulo {
private double lado1, lado2, lado3;

public Triangulo(double lado1, double lado2, double lado3) {
this.lado1 = lado1;
this.lado2 = lado2;
this.lado3 = lado3;
}

public boolean verificarTriangulo() {
return (lado1 + lado2 > lado3) &&
(lado1 + lado3 > lado2) &&
(lado2 + lado3 > lado1);
}

public double calcularArea() {
if (verificarTriangulo()) {
double s = (lado1 + lado2 + lado3) / 2;
return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
} else {
System.out.println("O triângulo não é válido.");
return 0;
}
}
}