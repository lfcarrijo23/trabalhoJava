package redeSocial;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nome;
	private List<Usuario> amigos;
	private List<Post> posts;

	public Usuario(String nome) {
		this.nome = nome;
		this.amigos = new ArrayList<>();
		this.posts = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public List<Usuario> getAmigos() {
		return amigos;
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void adicionarAmigo(Usuario amigo) {
		if (!amigos.contains(amigo)) {
			amigos.add(amigo);
			amigo.getAmigos().add(this);
		}
	}

	public void publicarPost(String conteudo) {
		Post post = new Post(this, conteudo);
		posts.add(post);
	}

	public void comentarPost(Post post, String conteudo) {
		Comentario comentario = new Comentario(this, conteudo);
		post.adicionarComentario(comentario);
	}
}