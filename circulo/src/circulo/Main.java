package circulo;

public class Main {
public static void main(String[] args) {
Circulo circulo = new Circulo();
circulo.setRaio(10);



double area = circulo.area();
double perimetro = circulo.perimetro();


System.out.println("Área: " + area);
System.out.println("Perímetro: " + perimetro);
}
}