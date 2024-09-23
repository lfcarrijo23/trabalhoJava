package redeSocial;

public class Main {
	public static void main(String[] args) {

		RedeSocial redeSocial = new RedeSocial();

		Usuario luis = new Usuario("Luís");
		Usuario fabiano = new Usuario("Fabiano");
		Usuario cristiano = new Usuario("Cristiano Ronaldo");

		redeSocial.adicionarUsuario(luis);
		redeSocial.adicionarUsuario(fabiano);
		redeSocial.adicionarUsuario(cristiano);

		luis.adicionarAmigo(fabiano);
		fabiano.adicionarAmigo(cristiano);

		luis.publicarPost("Olá, mundo!");
		fabiano.publicarPost("Bom dia!");
		cristiano.publicarPost("Como estão todos?");
		Post postLuis = luis.getPosts().get(0);
		fabiano.comentarPost(postLuis, "Oi, Luís!");

		Post postFabiano = fabiano.getPosts().get(0);
		cristiano.comentarPost(postFabiano, "Bom dia, Fabiano!");
		System.out.println("Post de Luís: " + postLuis.getConteudo());
		for (Comentario comentario : postLuis.getComentarios()) {
			System.out.println("Comentário de " + comentario.getAutor().getNome() + ": " + comentario.getConteudo());
		}

		System.out.println("\nPost de Fabiano: " + postFabiano.getConteudo());
		for (Comentario comentario : postFabiano.getComentarios()) {
			System.out.println("Comentário de " + comentario.getAutor().getNome() + ": " + comentario.getConteudo());
		}

		Usuario usuarioBuscado = redeSocial.buscarUsuario("Cristiano Ronaldo");
		if (usuarioBuscado != null) {
			System.out.println("\nUsuário encontrado: " + usuarioBuscado.getNome());
		} else {
			System.out.println("\nUsuário não encontrado.");
		}
	}
}