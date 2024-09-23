package calendario;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Calendario {
private Feriado feriado;

public Calendario() {
this.feriado = new Feriado();
}

public void exibirCalendario(int mes) {
LocalDate data = LocalDate.of(LocalDate.now().getYear(), mes, 1);
String nomeMes = feriado.getMesEmPortugues(mes);
System.out.println("Calendário de " + nomeMes);
System.out.println("Dom Seg Ter Qua Qui Sex Sáb");

int primeiroDiaSemana = data.getDayOfWeek().getValue();
for (int i = 1; i < primeiroDiaSemana; i++) {
System.out.print("    ");
}

while (data.getMonthValue() == mes) {
System.out.printf("%3d ", data.getDayOfMonth());
if (data.getDayOfWeek().getValue() == 7) {
System.out.println();
}
data = data.plusDays(1);
}
System.out.println();
}

public boolean isFeriado(LocalDate data) {
return feriado.isFeriado(data);
}

public long diferencaDias(LocalDate data1, LocalDate data2) {
return ChronoUnit.DAYS.between(data1, data2);
}
}