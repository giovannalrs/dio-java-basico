public class FabricaDeMotoCruiser extends FabricaDeMoto {
    @Override
    public Moto criarMoto() {
        return new MotoCruiser();
    }
}