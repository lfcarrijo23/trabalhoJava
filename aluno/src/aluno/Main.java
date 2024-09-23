package aluno;

public class Main {

	public static void main(String[] args) {
		Aluno aluno = new Aluno("Luís Fernando", "012345", 70.9f, 80.7f, 64.4f);

		float mediaFinal = aluno.calcularMedia();
		String situacao;

		if (mediaFinal >= 60) {
		situacao = "Aprovado";
		} else {
		situacao = "Reprovado";
		}

			System.out.println("Nome: " + aluno.getNome());
		System.out.println("Matrícula: " + aluno.getMatricula());
		System.out.println("Média Final: " + mediaFinal);
		System.out.println("Situação: " + situacao);
		}
		}
