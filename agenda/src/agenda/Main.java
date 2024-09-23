package agenda;

public class Main {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.adicionarContato(new Contato("Luís Fernando", "984149009"));
        agenda.adicionarContato(new Contato("Fabiano", "987654321"));
        

        agenda.exibirContatos();

        agenda.editarContato("Luís Fernando", "999865100");
        
        Contato contato = agenda.buscarPorNome("Fabiano");
        if (contato != null) {
            System.out.println("Contato encontrado: " + contato);
        } else {
            System.out.println("Contato não encontrado.");
        }
        Contato contato3 = agenda.buscarPorTelefone("999865100");
        if (contato3 != null) {
            System.out.println("Contato encontrado: " + contato3);
        } else {
            System.out.println("Contato não encontrado");
        }
        Contato contato2 = agenda.buscarPorTelefone("654645456");
        if (contato2 != null) {
            System.out.println("Contato encontrado: " + contato2);
        } else {
            System.out.println("Contato não encontrado");
        }
      
        agenda.removerContato("Fabiano");
        agenda.exibirContatos();
    }
}
