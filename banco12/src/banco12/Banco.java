package banco12;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Cliente> clientes;
    private List<ContaBancaria> contas;

    public Banco() {
        this.clientes = new ArrayList<>();
        this.contas = new ArrayList<>();
    }


    public Cliente cadastrarCliente(String nome, String cpf) {
        Cliente cliente = new Cliente(nome, cpf);
        clientes.add(cliente);
        return cliente;
    }


    public ContaBancaria abrirConta(Cliente cliente, int numeroConta) {
        ContaBancaria conta = new ContaBancaria(numeroConta, cliente);
        contas.add(conta);
        return conta;
    }


    public boolean sacar(ContaBancaria conta, double valor) {
        return conta.sacar(valor);
    }

    public void depositar(ContaBancaria conta, double valor) {
        conta.depositar(valor);
    }

    public boolean transferir(ContaBancaria contaOrigem, ContaBancaria contaDestino, double valor) {
        return contaOrigem.transferir(contaDestino, valor);
    }
    public ContaBancaria encontrarContaPorNumero(int numeroConta) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumero() == numeroConta) {
                return conta;
            }
        }
        return null;
    }
}
