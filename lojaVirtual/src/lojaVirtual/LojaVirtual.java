package lojaVirtual;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LojaVirtual {
    private List<Produto> produtosCadastrados;
    private Carrinho carrinho;
    private GerenciadorDesconto gerenciadorDesconto;

    public LojaVirtual() {
        this.produtosCadastrados = new ArrayList<>();
        this.carrinho = new Carrinho();
        this.gerenciadorDesconto = new GerenciadorDesconto();

        // Produtos iniciais
        produtosCadastrados.add(new Produto("Teclado", 150.00));
        produtosCadastrados.add(new Produto("Mouse", 80.00));
        produtosCadastrados.add(new Produto("Monitor", 600.00));
    }

    public void cadastrarProduto(String nome, double preco) {
        Produto produto = new Produto(nome, preco);
        produtosCadastrados.add(produto);
    }

    public List<Produto> getProdutosCadastrados() {
        return produtosCadastrados;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void aplicarDesconto(double percentual) {
        gerenciadorDesconto.aplicarDesconto(carrinho, percentual);
    }

    public double calcularTotalCompra() {
        return carrinho.calcularTotal();
    }

    // Função para exibir o menu e interagir com o usuário
    public void exibirMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n--- Loja Virtual ---");
            System.out.println("1. Ver produtos disponíveis");
            System.out.println("2. Cadastrar novo produto");
            System.out.println("3. Adicionar produto ao carrinho");
            System.out.println("4. Ver produtos no carrinho");
            System.out.println("5. Aplicar desconto");
            System.out.println("6. Ver total da compra");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.println("\nProdutos disponíveis:");
                    for (int i = 0; i < produtosCadastrados.size(); i++) {
                        System.out.println((i + 1) + ". " + produtosCadastrados.get(i));
                    }
                    break;
                case 2:
                    System.out.print("Nome do novo produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Preço do novo produto: ");
                    double preco = scanner.nextDouble();
                    cadastrarProduto(nome, preco);
                    System.out.println("Produto cadastrado com sucesso!");
                    break;
                case 3:
                    System.out.println("\nProdutos disponíveis:");
                    for (int i = 0; i < produtosCadastrados.size(); i++) {
                        System.out.println((i + 1) + ". " + produtosCadastrados.get(i));
                    }
                    System.out.print("Escolha o número do produto para adicionar ao carrinho: ");
                    int escolhaProduto = scanner.nextInt();
                    if (escolhaProduto > 0 && escolhaProduto <= produtosCadastrados.size()) {
                        Produto produtoSelecionado = produtosCadastrados.get(escolhaProduto - 1);
                        carrinho.adicionarProduto(produtoSelecionado);
                        System.out.println(produtoSelecionado.getNome() + " foi adicionado ao carrinho.");
                    } else {
                        System.out.println("Opção inválida.");
                    }
                    break;
                case 4:
                    System.out.println("\nProdutos no carrinho:");
                    if (carrinho.getProdutos().isEmpty()) {
                        System.out.println("O carrinho está vazio.");
                    } else {
                        for (Produto produto : carrinho.getProdutos()) {
                            System.out.println(produto);
                        }
                    }
                    break;
                case 5:
                    System.out.print("Digite o percentual de desconto: ");
                    double desconto = scanner.nextDouble();
                    aplicarDesconto(desconto);
                    System.out.println("Desconto aplicado com sucesso.");
                    break;
                case 6:
                    double total = calcularTotalCompra();
                    System.out.println("O total da compra é: R$ " + total);
                    break;
                case 7:
                    continuar = false;
                    System.out.println("Saindo da loja virtual. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        }
        scanner.close();
    }
}

