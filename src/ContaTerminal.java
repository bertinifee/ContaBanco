import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero da sua conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite a agencia: ");
        String agencia = scanner.next();

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá, " + nome + "obrigada por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + "e seu saldo atual é " + saldo);

    }
}