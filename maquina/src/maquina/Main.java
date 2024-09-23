package maquina;

public class Main {

	public static void main(String[] args) {
		MaquinaDeVendas maquina = new MaquinaDeVendas();
		maquina.cadastrarProduto("Suco", 5.50, 10);
		maquina.cadastrarProduto("Bolacha", 3.55, 5);
		maquina.cadastrarProduto("Chocolate", 4.25, 8);

		maquina.exibirEstoque();
		maquina.inserirDinheiro(10.00);
		maquina.comprarProduto("Suco");
		maquina.comprarProduto("Água");
		maquina.exibirEstoque();
		
		}
		}


