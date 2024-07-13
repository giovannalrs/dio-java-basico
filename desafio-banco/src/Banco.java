public class Banco {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Giovanna", "000.000.000.09");
        Cliente cliente2 = new Cliente("Clara", "000.000.000.22");

        Conta contaCorrente = new ContaCorrente("001", cliente1);
        Conta contaPoupanca = new ContaPoupanca("002", cliente2);

        contaCorrente.depositar(1000.0);
        contaPoupanca.depositar(500.0);

        contaCorrente.sacar(200.0);
        contaCorrente.transferir(contaPoupanca, 300.0);

        System.out.println("saldo conta corrente: R$" + contaCorrente.getSaldo());
        System.out.println("saldo conta poupançã: R$" + contaPoupanca.getSaldo());
    }
}