package banco;

public class Extrato {
 public void ExtratoConta(ContaBancaria Banco, float incremento){
	 float valor = Banco.getSaldo() + incremento;
	 Banco.setSaldo(valor);
	 System.out.println(valor);
 }
 public void ExtratoConta2 (ContaBancaria Banco, float decremento) {
	 float valor = Banco.getSaldo() - decremento;
	 Banco.setSaldo(valor);
	 System.out.println(valor);
 }
}
