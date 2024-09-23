package livro;

public class Main {

	public static void main(String[] args) {
		Livro livro = new Livro ("George Orwell","A revolução dos bichos", 96 );
		livro.emprestar();
		livro.emprestar();
		livro.devolver();
		livro.devolver();
	}

}
