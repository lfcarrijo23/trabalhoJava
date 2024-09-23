package agenda;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }
    public void adicionarContato(Contato contato) {
        contatos.add(contato);
        System.out.println("Contato adicionado: " + contato);
    }
    public void editarContato(String nome, String novoTelefone) {
        for (Contato contato : contatos) {
        	if (contato.getNome().equalsIgnoreCase(nome)) {
                contato.setTelefone(novoTelefone);
                System.out.println("Contato atualizado: " + contato);
                return;
            }
        }
        System.out.println("Contato não encontrado: " + nome);
    }
    public void removerContato(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contatos.remove(contato);
                System.out.println("Contato removido: " + contato);
                return;
            }
        }
        System.out.println("Contato não encontrado: " + nome);
    }

    public Contato buscarPorNome(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                return contato;
            }
        }
        return null;
    }


    public Contato buscarPorTelefone(String telefone) {
        for (Contato contato : contatos) {
            if (contato.getTelefone().equals(telefone)) {
                return contato;
            }
        }
        return null;
    }

    public void exibirContatos() {
        if (contatos.isEmpty()) {
            System.out.println("A agenda está vazia");
        } else {
            System.out.println("Lista de contatos:");
            for (Contato contato : contatos) {
                System.out.println(contato);
            }
        }
    }
}
