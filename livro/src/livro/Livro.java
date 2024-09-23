package livro;

public class Livro {
	private String autor;
	private String titulo;
	private int numeroPaginas;
	private boolean disponivel;

public Livro(String autor, String titulo, int numeroPaginas) {
	this.autor = autor;
	this.titulo = titulo;
	this.numeroPaginas = numeroPaginas;
	this.disponivel = true;
}

public String getAutor() {
	return autor;
}

public void setAutor(String autor) {
	this.autor = autor;
}

public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public int getNumeroPaginas() {
	return numeroPaginas;
}

public void setNumeroPaginas(int numeroPaginas) {
	this.numeroPaginas = numeroPaginas;
}

public boolean isDisponivel() {
	return disponivel;
}

public void emprestar() {
	if (disponivel) {
		disponivel = false;
		System.out.println("O livro " + titulo + " foi emprestado");
	} else {
		System.out.println("O livro " + titulo + " não está disponível para empréstimo");
}
}

public void devolver() {
	if (!disponivel) {
		disponivel = true;
		System.out.println("O livro "+ titulo +" foi devolvido");
} else {
	System.out.println("O livro " + titulo + " tem na biblioteca");
}
}
}
