package aluno;

public class Aluno {
private String nome;
private String matricula;
private float nota1;
private float nota2;
private float nota3;

	public Aluno(String nome, String matricula, float nota1, float nota2, float nota3) {
this.nome = nome;
this.matricula = matricula;
this.nota1 = nota1;
this.nota2 = nota2;
this.nota3 = nota3;
}

	public String getNome() {
return nome;
}

public void setNome(String nome) {
this.nome = nome;
}

public String getMatricula() {
return matricula;
}

public void setMatricula(String matricula) {
	this.matricula = matricula;
}

public float getNota1() {
	return nota1;
}

public void setNota1(float nota1) {
this.nota1 = nota1;
}

public float getNota2() {
return nota2;
}

public void setNota2(float nota2) {
this.nota2 = nota2;
}

public float getNota3() {
return nota3;
}

public void setNota3(float nota3) {
this.nota3 = nota3;
}

public float calcularMedia() {
	return (nota1 + nota2 + nota3) / 3;
}
}