package paciente;

import java.util.ArrayList;
import java.util.List;

public class Paciente {
	private String nome;
	private int idade;
	private List<String> historico;

public Paciente(String nome, int idade) {
	this.nome = nome;
	this.idade = idade;
	this.historico = new ArrayList<>();
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public int getIdade() {
	return idade;
}

public void setIdade(int idade) {
	this.idade = idade;
}

public List<String> getHistorico() {
	return historico;
}

public void adicionarConsulta(String consulta) {
	historico.add(consulta);
}

public void exibirConsultas() {
	System.out.println("Histórico de consultas de " + nome + ":");
	for (String consulta : historico) { //percorre todos os itens da variavel histórico
		System.out.println(consulta);
}
}
}