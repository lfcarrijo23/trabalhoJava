package banco;

public class ContaBancaria {
 private int nConta;
 private String nome;
 private float saldo;
public ContaBancaria(int i, String string, float f) {
	this.nConta = i;
	this.nome = string;
	this.saldo = f;
}

public int getnConta() {
	return nConta;
}
public void setnConta(int nConta) {
	this.nConta = nConta;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public float getSaldo() {
	return saldo;
}
public void setSaldo(float saldo) {
	this.saldo = saldo;
}
 
}
