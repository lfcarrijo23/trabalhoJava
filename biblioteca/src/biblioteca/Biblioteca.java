package biblioteca;

import java.util.HashMap;
import java.util.Map;

public class Biblioteca {
private Map<String, Livro> livros;

public Biblioteca() {
this.livros = new HashMap<>();
}

public void cadastrarLivro(String titulo, String autor) {
if (!livros.containsKey(titulo)) {
livros.put(titulo, new Livro(titulo, autor));
System.out.println("Livro cadastrado");
} else {
System.out.println("Livro já cadastrado.");
}
}

public void emprestarLivro(String titulo) {
Livro livro = livros.get(titulo);
if (livro != null && livro.isDisponivel()) {
livro.setDisponivel(false);
System.out.println("Livro emprestado");
} else {
System.out.println("Livro não disponível");
}
}

public void devolverLivro(String titulo) {
Livro livro = livros.get(titulo);
if (livro != null && !livro.isDisponivel()) {
livro.setDisponivel(true);
System.out.println("Livro devolvido");
} else {
System.out.println("Livro não foi emprestado");
}
}

public void verificarDisponibilidade(String titulo) {
Livro livro = livros.get(titulo);
if (livro != null) {
if (livro.isDisponivel()) {
System.out.println("Livro disponível.");
} else {
System.out.println("Livro não disponível.");
}
} else {
System.out.println("Livro não encontrado.");
}
}
}	