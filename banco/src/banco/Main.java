package banco;

public class Main {

	public static void main(String[] args) {
		ContaBancaria Banco = new ContaBancaria(12324545, "Luís Fernando", 100.00f);
		Extrato saldoDep = new Extrato();
		
		saldoDep.ExtratoConta(Banco,50.00f);
		saldoDep.ExtratoConta2(Banco, 40.00f);

	}

}
