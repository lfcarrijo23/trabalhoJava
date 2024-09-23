package maquina;

import java.util.ArrayList;
import java.util.List;

class Produto {
	private String nome;
	private double preco;
	private int quantidade;

public Produto(String nome, double preco, int quantidade) {
	this.nome = nome;
	this.preco = preco;
	this.quantidade = quantidade;
}

public String getNome() {
	return nome;
}

public double getPreco() {
	return preco;
}

public int getQuantidade() {
	return quantidade;
}

public void setQuantidade(int quantidade) {
	this.quantidade = quantidade;
}
}

public class MaquinaDeVendas {
	private List<Produto> produtos;
	private double saldo;

public MaquinaDeVendas() {
	this.produtos = new ArrayList<>();
	this.saldo = 0.0;
}

public void cadastrarProduto(String nome, double preco, int quantidade) {
		Produto produto = new Produto(nome, preco, quantidade);
		produtos.add(produto);
}

public void exibirEstoque() {
	for (Produto produto : produtos) {
		System.out.println(produto.getNome() + " R$" + produto.getPreco() + " Quantidade: " + produto.getQuantidade());
}
}

public Produto selecionarProduto(String nome) {
	for (Produto produto : produtos) {
		if (produto.getNome().equals(nome)) {
			if (produto.getQuantidade() > 0) {
				return produto;
} else {
	System.out.println("Não tem o produto no estoque");
	return null;
}
}
}
System.out.println("Produto não encontrado");
	return null;
}

public void inserirDinheiro(double valor) {
	saldo += valor;
	System.out.println("Saldo atual: R$" + saldo);
}

public void comprarProduto(String nome) {
	Produto produto = selecionarProduto(nome);
	if (produto != null) {
		if (saldo >= produto.getPreco()) {
			saldo -= produto.getPreco();
			produto.setQuantidade(produto.getQuantidade() - 1);
			double troco = saldo;
			saldo = 0;
			System.out.println("Você comprou " + produto.getNome() + " Troco: R$" + troco);
} else {
	System.out.println("Saldo insuficiente");
}
}
}}