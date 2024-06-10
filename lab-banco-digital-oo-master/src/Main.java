import model.Cliente;
import model.Conta;
import service.ContaCorrente;
import service.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setCpf("123.124.125-50");
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.sacar(30);
		cc.transferir(30, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
