package redeSocial;

import java.util.ArrayList;
import java.util.List;

public class RedeSocial {
	private List<Usuario> usuarios;

	public RedeSocial() {
		this.usuarios = new ArrayList<>();
	}

	public void adicionarUsuario(Usuario usuario) {
		usuarios.add(usuario);
	}

	public Usuario buscarUsuario(String nome) {
		for (Usuario usuario : usuarios) {
			if (usuario.getNome().equalsIgnoreCase(nome)) {
				return usuario;
			}
		}
		return null;
	}
}
