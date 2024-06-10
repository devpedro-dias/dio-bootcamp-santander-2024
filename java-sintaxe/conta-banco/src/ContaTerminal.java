import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer numeroAgencia;

        String agencia;

        String nomeCliente;

        Double saldo= 237.48;

        System.out.println("Por favor, digite o número da Agência:");
        
        numeroAgencia = sc.nextInt();

        System.out.println("Digite a Agência agora: (ex.: 000-0)");

        agencia = sc.next();

        System.out.println("Qual é o seu nome?");

        nomeCliente = sc.next();
        sc.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ",sua conta é " + agencia +" e seu saldo: " + saldo + " já está disponível para saque.");





    }
}
