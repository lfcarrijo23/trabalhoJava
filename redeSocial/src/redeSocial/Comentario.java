package redeSocial;

public class Comentario {
private Usuario autor;
private String conteudo;

public Comentario(Usuario autor, String conteudo) {
this.autor = autor;
this.conteudo = conteudo;
}

public Usuario getAutor() {
return autor;
}

public String getConteudo() {
return conteudo;
}
}
