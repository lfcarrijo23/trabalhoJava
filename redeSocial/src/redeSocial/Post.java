package redeSocial;

import java.util.ArrayList;
import java.util.List;

public class Post {
private Usuario autor;
private String conteudo;
private List<Comentario> comentarios;

public Post(Usuario autor, String conteudo) {
this.autor = autor;
this.conteudo = conteudo;
this.comentarios = new ArrayList<>();
}

public Usuario getAutor() {
return autor;
}

public String getConteudo() {
return conteudo;
}

public List<Comentario> getComentarios() {
return comentarios;
}

public void adicionarComentario(Comentario comentario) {
comentarios.add(comentario);
}
}
