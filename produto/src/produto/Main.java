package produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String nome = scanner.next();

        System.out.println("Digite o preço do produto: ");
        double preco = scanner.nextDouble();

        System.out.println("Digite a quantidade que existe em estoque: ");
        int qtd = scanner.nextInt();

        Produto produto = new Produto(nome, preco, qtd);

        System.out.println("Qual operação deseja realizar? ");
        System.out.println("1- Custo");
        System.out.println("2- Disponibilidade");
        int choice = scanner.nextInt();

        switch(choice){
            case 1:
                produto.calcularCusto(preco, qtd);
                break;
            case 2:
                produto.calcularEstoque(qtd);
                break;
            default:
                System.out.println("Opção indisponível!");
        }
        scanner.close();
    }
}