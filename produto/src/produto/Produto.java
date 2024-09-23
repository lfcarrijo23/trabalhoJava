package produto;

public class Produto {
    private String nome;
    private double preco, custo;
    private int qtd;

    public Produto(String nome, double preco, int qtd){
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }

    public void calcularCusto(double preco, int qtd){
        custo = preco * qtd;
        System.out.println("O Custo total do produto "+nome+" é: R$"+custo);
    }

    public void calcularEstoque(double qtd){
        if(qtd >= 1){
            System.out.println("Existe estoque disponível!!!");
        }else{
            System.out.println("Não existe estoque disponível no momento!!!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
}

