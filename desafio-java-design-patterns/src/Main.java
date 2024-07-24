public class Main {
    public static void main(String[] args) {
        // Cliente escolhe a fábrica baseada na escolha
        FabricaDeMoto fabrica = obterFabricaEscolhida("esportiva"); // Pode ser "cruiser" ou "esportiva"
        Moto motoEscolhida = fabrica.criarMoto();

        // Exibir detalhes da moto
        motoEscolhida.exibirDetalhes();

        // Calcular e exibir o preço
        double preco = motoEscolhida.calcularPreco();
        System.out.println("Preço da moto: R$ " + preco);
    }

    // Método para obter a fábrica escolhida
    private static FabricaDeMoto obterFabricaEscolhida(String tipo) {
        if (tipo.equals("esportiva")) {
            return new FabricaDeMotoEsportiva();
        } else if (tipo.equals("cruiser")) {
            return new FabricaDeMotoCruiser();
        } else {
            throw new IllegalArgumentException("Tipo de moto desconhecido.");
        }
    }
}
