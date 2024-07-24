public class FabricaDeMotoEsportiva extends FabricaDeMoto {
    @Override
    public Moto criarMoto() {
        return new MotoEsportiva();
    }
}