import java.util.Arrays;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o número da agência: ");
        String numeroAgencia = scanner.nextLine();

        System.out.println("Digite o número da agência: ");
        String numeroConta = scanner.nextLine();

        System.out.println("Digite o saldo inicial: ");
        String saldoInicial = scanner.nextLine();

        scanner.close();

        System.out.println("Olá ".concat(nomeCliente)
                .concat(", sua agência é ")
                .concat(numeroAgencia)
                .concat(", sua conta é ")
                .concat(numeroConta)
                .concat(", e seu saldo de ")
                .concat(saldoInicial));
    }
}
