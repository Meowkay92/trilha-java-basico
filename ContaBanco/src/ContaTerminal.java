import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("---------------CONTA BANCÁRIA---------------");
        System.out.println();
        
        System.out.print("Por favor, digite o número da Conta: ");
        numero = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Por favor, digite o número da Agência: ");
        agencia = sc.nextLine();

        System.out.print("Me informe seu nome: ");
        nomeCliente = sc.nextLine();

        System.out.print("Agora me informe seu saldo atual: ");
        saldo = sc.nextDouble();

        System.out.println();
        System.out.printf("Olá %s, parabéns por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
                nomeCliente, agencia, numero, saldo);

        sc.close();
    }
}
