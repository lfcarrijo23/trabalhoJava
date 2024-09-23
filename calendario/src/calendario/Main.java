package calendario;

import java.time.LocalDate;

public class Main {
public static void main(String[] args) {
Calendario calendario = new Calendario();
calendario.exibirCalendario(9); 

LocalDate data1 = LocalDate.of(2024, 9, 22);
LocalDate data2 = LocalDate.of(2024, 12, 25);

System.out.println("A data " + data1 + " é feriado? " + calendario.isFeriado(data1));
System.out.println("A data " + data2 + " é feriado? " + calendario.isFeriado(data2));

System.out.println("Diferença de dias entre " + data1 + " e " + data2 + ": " + calendario.diferencaDias(data1, data2));
}
}
