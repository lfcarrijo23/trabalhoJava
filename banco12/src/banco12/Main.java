package banco12;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Cliente cliente1 = banco.cadastrarCliente("Luís Carrijo", "12345678901");
        Cliente cliente2 = banco.cadastrarCliente("Fabiano", "98765432100");


        ContaBancaria conta1 = banco.abrirConta(cliente1, 1001);
        ContaBancaria conta2 = banco.abrirConta(cliente2, 1002);


        banco.depositar(conta1, 500);
        banco.sacar(conta1, 100);
        banco.transferir(conta1, conta2, 200);

        System.out.println("Saldo conta 1: " + conta1.getSaldo());
        System.out.println("Saldo conta 2: " + conta2.getSaldo());
    }
}
