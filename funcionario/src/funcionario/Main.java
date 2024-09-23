package funcionario;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário: ");
        String nome = scanner.next();

        System.out.println("Digite o salario do funcionário: ");
        double salario = scanner.nextDouble();

        System.out.println("Digite o cargo do Funcionário: ");
        String cargo = scanner.next();


    }
}