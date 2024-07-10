import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o limite diário de saque: ");
        double limiteDiario = scanner.nextDouble();
        double saldoLimite = limiteDiario;

        for (int i = 1; ; i++) {
            System.out.print("Informe o valor do saque (0 para encerrar): ");
            double valorSaque = scanner.nextDouble();

            if (valorSaque == 0) {
                System.out.println("Transações encerradas.");
                break; 
            } else if (valorSaque > saldoLimite) {
                System.out.println("Limite diário de saque atingido. Transações encerradas.");
                break; 
            } else {
                saldoLimite -= valorSaque;
                System.out.printf("Saque de %.2f realizado com sucesso. Saldo restante do limite diário: %.2f\n", valorSaque, saldoLimite);
            }
        }
        scanner.close();
    }
}
