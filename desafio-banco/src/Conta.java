public abstract class Conta {
    private String numero;
    private double saldo;
    private Cliente cliente;

    public Conta(String numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    public String getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("depósito de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("valor de depósito inválido.");
        }
    }
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            System.out.println("saque de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("saldo insuficiente ou valor de saque inválido.");
        }
    }
    public void transferir(Conta destino, double valor) {
        if (destino  != null && valor > 0 && saldo >= valor) {
            this.sacar(valor);
            destino.depositar(valor);
            System.out.println("transferência de R$" + valor + " realizada com sucesso!");
        } else {
            System.out.println("transferência não realizada. tente novamente.");
        }    
    }
}