public class MotoCruiser implements Moto {
    private double precoBase = 12000;

    @Override
    public void exibirDetalhes() {
        System.out.println("Modelo: Moto Cruiser");
        System.out.println("Descrição: Confortável e ideal para longas viagens.");
    }

    @Override
    public double calcularPreco() {
        return precoBase;
    }
}
