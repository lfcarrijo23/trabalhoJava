package circulo;

public class Circulo {
private double raio;

 public double getRaio() {
return raio;
}

public void setRaio(double raio) {
this.raio = raio;
}

public double area() {
return 3.14 * raio * raio; 
}

public double perimetro() {
return 2 * 3.14 * raio; 
}
}
