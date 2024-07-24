// Moto concreta - MotoEsportiva
public class MotoEsportiva implements Moto {
    private double precoBase = 15000;

    @Override
    public void exibirDetalhes() {
        System.out.println("Modelo: Moto Esportiva");
        System.out.println("Descrição: Rápida e estilosa!");
    }

    @Override
    public double calcularPreco() {
        return precoBase;
    }
}
