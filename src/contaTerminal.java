import java.util.Locale;
import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {
        //declarando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        //criando as mensagens e os inputs das variaveis
        System.out.println("Digite o numero da sua conta:");
        int numeroConta = scanner.nextInt();
        System.out.println("Digite o numero da sua agencia:");
        String agencia = scanner.next();
        System.out.println("Digite o numero seu nome :");
        String nomeCliente = scanner.next();
        System.out.println("Digite seu saldo de deposito :");
        Double saldoConta = scanner.nextDouble();
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta +  " e seu saldo de $" + saldoConta + " já está disponível para saque.");
         // Fechar o scanner para liberar os recursos
        scanner.close();
    }
}

