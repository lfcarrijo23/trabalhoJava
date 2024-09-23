package calendario;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Feriado {
private Set<LocalDate> feriados;

public Feriado() {
feriados = new HashSet<>();

feriados.add(LocalDate.of(LocalDate.now().getYear(), 1, 1));
feriados.add(LocalDate.of(LocalDate.now().getYear(), 12, 25));

}

public boolean isFeriado(LocalDate data) {
return feriados.contains(data);
}

public String getMesEmPortugues(int mes) {
switch (mes) {
case 1: return "Janeiro";
case 2: return "Fevereiro";
case 3: return "Março";
case 4: return "Abril";
case 5: return "Maio";
case 6: return "Junho";
case 7: return "Julho";
case 8: return "Agosto";
case 9: return "Setembro";
case 10: return "Outubro";
case 11: return "Novembro";
case 12: return "Dezembro";
default: return "Mês inválido";
}
}
}