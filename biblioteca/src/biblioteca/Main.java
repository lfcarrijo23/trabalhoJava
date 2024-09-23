package biblioteca;

public class Main {
public static void main(String[] args) {
Biblioteca biblioteca = new Biblioteca();
biblioteca.cadastrarLivro("A Revolução dos Bichos", "George Orwell");
biblioteca.verificarDisponibilidade("A Revolução dos Bichos");
biblioteca.emprestarLivro("A Revolução dos Bichos");
biblioteca.verificarDisponibilidade("A Revolução dos Bichos");
biblioteca.devolverLivro("A Revolução dos Bichos");
biblioteca.verificarDisponibilidade("A Revolução dos Bichos");
}
}