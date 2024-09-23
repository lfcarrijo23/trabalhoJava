package paciente;

public class Main {

	public static void main(String[] args) {
		Paciente paciente = new Paciente("Luís Fernando", 22);
		paciente.adicionarConsulta("Consulta dia 23/04/2024");
		paciente.adicionarConsulta("Retorno dia 04/07/2024");
		paciente.exibirConsultas();

	}

}
